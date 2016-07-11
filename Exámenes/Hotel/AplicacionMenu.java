import java.util.*;

public class AplicacionMenu
{

	private static int menuPrincipal()
	{
		int res = 0;
		Scanner lector = new Scanner(System.in);
		
		do
		{
			System.out.println("\n - MENU PRINCIPAL -");
			System.out.println(" 1. Insertar una habitación.");
			System.out.println(" 2. Buscar una habitación por su número.");
			System.out.println(" 3. Mostrar todas las habitaciones con más de un aseo.");
			System.out.println(" 4. Devolver el total de m2 de las suites nupciales.");
			System.out.println(" 0. Salir");
			System.out.print(" Introduce una opcion: ");
			res = lector.nextInt();
		}while ((res < 0)||(res > 4));
		
		return res;
	}
	
	private static int menuHabitacion()
	{
		int res = 0;
		Scanner lector = new Scanner(System.in);
		
		do
		{
			System.out.println(" - TIPO DE HABITACION A INSERTAR -");
			System.out.println(" 1. Habitacion Convencional.");
			System.out.println(" 2. Habitacion Empresarial.");
			System.out.println(" 3. Suite.");
			System.out.println(" 4. Suite Nupcial.");
			System.out.print(" Introduce una opcion: ");
			res = lector.nextInt();
		}while ((res < 1)||(res > 4));
		
		return res;
	}
	

	public static void main(String[] args)
	{
		Habitacion habitacion;
		int tamanoHotel = 10;
		int opcion = 0, opcionHabitacion = 1;
		int numHab;
		float superficieHab, precioHab;
		boolean vistasHab,mesaHab,jacuzziHab,bodaHab;
		int aseosHab;
		
		Scanner lector = new Scanner(System.in);
		
		do
		{
			System.out.println("Introduzca el tamano del hotel (>= 5): ");
			tamanoHotel = lector.nextInt();
		}while (tamanoHotel < 5);
		Hotel hotel = new Hotel(tamanoHotel);
		
		do
		{
			opcion = menuPrincipal();
			switch (opcion)
			{
				case 1:
				{
					opcionHabitacion = menuHabitacion();
					do
					{
						System.out.println("Introduzca el numero de la habitacion: ");
						numHab = lector.nextInt();
					}while (numHab <= 0);
					do
					{
						System.out.println("Introduzca la superficie de la habitacion: ");
						superficieHab = lector.nextFloat();
					}while (superficieHab < 1);
					do
					{
						System.out.println("Introduzca el precio/m2 de la habitacion: ");
						precioHab = lector.nextFloat();
					}while (precioHab < 1);
					if (opcionHabitacion == 1)
					{
						System.out.println("Introduzca si tienes vistas exteriores la habitacion: ");
						vistasHab = lector.nextBoolean();
						habitacion = new Habitacion(numHab,superficieHab,precioHab,vistasHab);
					}
					else if (opcionHabitacion == 2)
					{
						System.out.println("Introduzca si tiene mesa la habitacion: ");
						mesaHab = lector.nextBoolean();
						habitacion = new HabitacionEmpresario(numHab,superficieHab,precioHab,mesaHab);
					}
					else
					{
						do
						{
							System.out.println("Introduzca el numero de aseos de la habitacion: ");
							aseosHab = lector.nextInt();
						}while (aseosHab <= 0);
						if (opcionHabitacion == 3)
						{
							System.out.println("Introduzca si tiene jacuzzi la habitacion: ");
							jacuzziHab = lector.nextBoolean();
							habitacion = new Suite(numHab,superficieHab,precioHab,aseosHab,jacuzziHab);
						}
						else
						{
							System.out.println("Introduzca el cliente ha celebrado su boda en el hotel: ");
							bodaHab = lector.nextBoolean();
							habitacion = new SuiteNupcial(numHab,superficieHab,precioHab,aseosHab,bodaHab);
						}

					}
					hotel.insertarHabitacion(habitacion);
					break;
				}
				case 2:
				{
					do
					{
						System.out.println("Introduzca el numero de la habitacion: ");
						numHab = lector.nextInt();
					}while (numHab <= 0);
					System.out.print(hotel.mostrarInfoHabitacion(numHab));
					break;
				}
				case 3:
				{
					System.out.println("Las habitaciones con mas de un aseo son:");
					System.out.print(hotel.mostrarHabitacionesAseos());
					break;
				}
				case 4:
				{
					System.out.print("El total de m2 de suites nupciales de hotel son: ");
					System.out.println(hotel.mostarM2SuitesNupciales());
					break;
				}
			}
		}while (opcion != 0);
	}
}
