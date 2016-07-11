package HashMap;
import java.util.*;

public class Ejercicio1
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		HashMap<String,Double> coleccion;
		coleccion = new HashMap<String,Double>();
		
		String nombre;
		double nota = 0;
		
		
		
		
			char salida = 'N';
		do
		{
			System.out.print("Introduzca el nombre del alumno: ");
			nombre = teclado.nextLine();
			
			System.out.print("Introduzca la nota del alumno: ");
			nota = teclado.nextDouble();
			
			
			coleccion.put(nombre, nota);
			teclado.nextLine();
			
			System.out.print("Desea continuar (S/N): ");
			salida = teclado.nextLine().toUpperCase().charAt(0);
			
		}while (salida == 'S');
		
		
		
		
		
		
		// Busqueda por nombre
		System.out.println(" -- BUSQUEDA POR NOMBRE -- ");
		
		System.out.print("Introduzca el nombre del alumno: ");
		nombre = teclado.nextLine();
		
		if (coleccion.containsKey(nombre))
			System.out.println("La nota del alumno es: " 
					+ coleccion.get(nombre));

		else
			System.out.println("No existe el alumno indicado");
		
		
		
		
		
		// Busqueda por nota
		System.out.println(" -- BUSQUEDA POR NOTA -- ");
		
		System.out.print("Introduzca la nota del alumno: ");
		nota = teclado.nextDouble();
		
		
		if (coleccion.containsValue(nota))
		{
			
			Set<Map.Entry<String,Double>> recorrido;
			
			recorrido = coleccion.entrySet();
			
			for (Map.Entry<String, Double> objeto: recorrido)
			{
				if (objeto.getValue() == nota)
				{
					System.out.println("El nombre del alumno es: " 
							+ objeto.getKey());
				}
			}
		}
		else
			System.out.println("No existe ningun alumno con la nota indicada");
	}
}
