import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal
{
	private static Scanner teclado;

	static
	{
		teclado = new Scanner(System.in);
	}
	
	public static int menu()
	{
		int opcion = 0;
		
		do
		{
			System.out.println(" --- MENU ---");
			System.out.println(" 1 - Insertar Jugador a CB Las Lagunas");
			System.out.println(" 2 - Insertar Jugador al CB Mijas");
			System.out.println(" 3 - Eliminar Jugador del CB Mijas");
			System.out.println(" 4 - Mostrar el CB Mijas ordenado ascendentemente por su valor deportivo actual");
			System.out.println(" 5 - Mostrar el CB Las Lagunas ordenados ascendentemente por el nombre de sus jugadores");
			System.out.println(" 6 - Jugar un partido entre el CB Las Lagunas y CB Mijas");
			System.out.println(" 7 - Guardar");
			System.out.println(" 0 - Salir");
			System.out.print(" Introduzca la opcion elegida: ");
			opcion = teclado.nextInt();
			teclado.nextLine();   // Limpiar el buffer de teclado
		}while ((opcion < 0)||(opcion > 7));
		
		return opcion;
	}
	
	public static boolean insertarJugador(EquipoBalonmano equipo)
	{
		boolean res = false;
		String nombre = "";
		int nivelDeportivo = 0;
		JugadorBalonmano jugador = null;
		boolean repetir = false;

		
		System.out.print("Introduzca el nombre completo del jugador de balonmano: ");
		nombre = teclado.nextLine();
		
		do
		{
			repetir = false;
			System.out.print("Introduzca el nivel deportivo del jugador: ");
			try
			{
				nivelDeportivo = teclado.nextInt();
			}
			catch (InputMismatchException e)
			{
				repetir = true;
			}
		}while (repetir);
		teclado.nextLine();
		
		jugador = new JugadorBalonmano(nombre,nivelDeportivo);
		res = equipo.ficharJugador(jugador);
		
		return res;
	}
	
	public static void guardar(EquipoBalonmano equipo, File fichero) throws FileNotFoundException
	{
		FileOutputStream flujoByteSalida = new FileOutputStream(fichero);
		try
		{
			ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoByteSalida);
			flujoObjetoSalida.writeObject(equipo);
			flujoObjetoSalida.close();
		} 
		catch (IOException e)
		{
			System.out.println(" --- ERROR EN LA ENTRADA/SALIDA AL GUARDAR LOS DATOS---");
		}
	}
	
	public static EquipoBalonmano cargarEquipo(File fichero)
	{
		EquipoBalonmano equipo = null;
		
		if (fichero.exists())
		{
			FileInputStream flujoByteEntrada;
			ObjectInputStream flujoObjetoEntrada;
			try
			{
				flujoByteEntrada = new FileInputStream(fichero);
				flujoObjetoEntrada = new ObjectInputStream(flujoByteEntrada);
				equipo = (EquipoBalonmano)flujoObjetoEntrada.readObject();
			}
			catch (IOException e)
			{
				System.out.println(" --- ERROR EN LA ENTRADA/SALIDA DEL EQUIPO---");
			}
			catch (ClassNotFoundException e)
			{
				System.out.println(" --- ERROR EN LA ENTRADA/SALIDA DEL EQUIPO 2---");
			}
		}
		
		return equipo;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		int opcion = 0;
		String nombre = null;
		EquipoBalonmano equipo1 = null;
		EquipoBalonmano equipo2 = null;
		EquipoBalonmano ganadorPartido = null;
		File fichero1 = new File("equipo1.txt");
		File fichero2 = new File("equipo2.txt");
		
		equipo1 = cargarEquipo(fichero1);
		if (equipo1 == null)
			equipo1 = new EquipoBalonmano("CB Las Lagunas");
		
		equipo2 = cargarEquipo(fichero2);
		if (equipo2 == null)
			equipo2 = new EquipoBalonmano("CB Mijas");
		
		// Menu de operaciones
		do
		{
			opcion = menu();
			switch (opcion)
			{
				case 1:
					if (insertarJugador(equipo1))
						System.out.println("Se ha fichado al jugador en el CB Las Lagunas");
					else
						System.out.println("Se ha producido un error en el fichaje del jugador en el CB Las Lagunas");
					break;
				case 2:
					if (insertarJugador(equipo2))
						System.out.println("Se ha fichado al jugador en el CB Mijas");
					else
						System.out.println("Se ha producido un error en el fichaje del jugador en el CB Mijas");
					break;
				case 3:
					System.out.print(" Introduzca el nombre del jugador a eliminar: ");
					nombre = teclado.nextLine();
					if (equipo2.expulsarJugador(nombre))
						System.out.println("El jugador ha sido eliminado del equipo");
					else
						System.out.println("El jugador que has indicado no existe en ese equipo");
					break;
				case 4:
					System.out.println(equipo2.devolverEquipoValorDeportivoActualAscendente());
					break;
				case 5:
					System.out.println(equipo1.devolverEquipoValorNombreAscendente());
					break;
				case 6:
					ganadorPartido = null;
					ganadorPartido = EquipoBalonmano.partido(equipo1, equipo2);
					if (ganadorPartido != null)
						System.out.println("\n\n\tEL GANADOR DEL PARTIDO DISPUTADO HA SIDO: " + ganadorPartido.getNombre());
					break;
				case 7:
					try
					{
						guardar(equipo1,fichero1);
						guardar(equipo2,fichero2);
					} catch (FileNotFoundException e)
					{}
					break;
			}
		}while (opcion != 0);
	}
	
	public void finalize()
	{
		teclado.close();
	}
}
