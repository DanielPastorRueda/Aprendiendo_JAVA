import java.util.*;

public class Aplicacion
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
			System.out.println("\n  ---  MENU  ---");
			System.out.println("1. Insetar Alumno en el instituto");
			System.out.println("2. Insertar Profesor en el instituto");
			System.out.println("3. Eliminar Persona del instituto");
			System.out.println("4. Mostrar Persona por Nombre");
			System.out.println("5. Devolver el numero de Alumnos");
			System.out.println("6. Devolver el numero de Profesores");
			System.out.println("7. Calcular la nota media de los Alumnos menores de una edad");
			System.out.println("8. Calcular la edad media de los Profesores mayores de una antiguedad");
			System.out.println("9. Mostrar todas las Personas del listado");
			System.out.println("0. Salir");
			System.out.print("Introduzca una opcion: ");
			opcion = teclado.nextInt();
			teclado.nextLine();
		}while ((opcion < 0) || (opcion > 9));
		
		return opcion;
	}
	
	public static void insertarAlumno(PersonalInstituto listado)
	{
		String nif, nombre;
		int edad;
		double nota;
		
		System.out.print("Introduzca el NIF del alumno: ");
		nif = teclado.nextLine();
		System.out.print("Introduzca el nombre del alumno: ");
		nombre = teclado.nextLine();
		System.out.print("Introduzca la edad del alumno: ");
		edad = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Introduzca la nota del alumno: ");
		nota = teclado.nextDouble();
		teclado.nextLine();
		if (listado.insertarPersona(new Alumno(nif,nombre,edad,nota)))
			System.out.println("El alumno se ha insertado correctamente");
		else
			System.out.println(" ERROR - Se ha producido un error al introducir el alumno");
	}
	
	public static void insertarProfesor(PersonalInstituto listado)
	{
		String nif, nombre;
		int edad, antiguedad;
		
		System.out.print("Introduzca el NIF del profesor: ");
		nif = teclado.nextLine();
		System.out.print("Introduzca el nombre del profesor: ");
		nombre = teclado.nextLine();
		System.out.print("Introduzca la edad del profesor: ");
		edad = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Introduzca la antiguedad del profesor: ");
		antiguedad = teclado.nextInt();
		teclado.nextLine();
		if (listado.insertarPersona(new Profesor(nif,nombre,edad,antiguedad)))
			System.out.println("El profesor se ha insertado correctamente");
		else
			System.out.println(" ERROR - Se ha producido un error al introducir el profesor");
	}
	
	public static void eliminarPersona(PersonalInstituto listado)
	{
		String nif;
		
		System.out.print("Introduzca el NIF del alumno: ");
		nif = teclado.nextLine();
		if (listado.estaPersona(nif))
			listado.eliminarPersona(nif);
		else
			System.out.println(" ERROR - No existe ninguna persona con ese NIF en el listado");
	}
	
	public static void mostrarPersonaPorNombre(PersonalInstituto listado)
	{
		String nombre;
		
		System.out.print("Introduzca el nombre del alumno: ");
		nombre = teclado.nextLine();
		System.out.println(listado.mostrarPersonaPorNombre(nombre));
	}
	
	public static void mostarNumeroAlumnos(PersonalInstituto listado)
	{
		System.out.printf("\nHay %s alumnos en listado\n", listado.numeroAlumnos());
	}
	
	public static void mostarNumeroProfesores(PersonalInstituto listado)
	{
		System.out.printf("\nHay %s profesores en listado\n", listado.numeroProfesores());
	}
	
	public static void main(String[] args)
	{
		int opcion;
		int edad, antiguedad;
		
		PersonalInstituto listado = new PersonalInstituto();
		
		do
		{
			opcion = menu();
			switch (opcion)
			{
				case 1:
					insertarAlumno(listado);
					break;
				case 2:
					insertarProfesor(listado);
					break;
				case 3:
					eliminarPersona(listado);
					break;
				case 4:
					mostrarPersonaPorNombre(listado);
					break;
				case 5:
					mostarNumeroAlumnos(listado);
					break;
				case 6:
					mostarNumeroProfesores(listado);
					break;
				case 7:
					System.out.print("Introduzca la edad maxima para calcular la nota media del alumnado: ");
					edad = teclado.nextInt();
					teclado.nextLine();
					System.out.printf("\nLa nota media del alumnado menor de %d es %.2f\n",edad,listado.notaMediaAlumnosMenoresDe(edad));
					break;
				case 8:
					System.out.print("Introduzca la antiguedad minima para calcular la edad media del profesorado: ");
					antiguedad = teclado.nextInt();
					teclado.nextLine();
					System.out.printf("\nLa edad media del profesorado mayor de %d anos de antiguedad es %.2f\n",antiguedad,listado.edadMediaProfesoresAntiguedadMayor(antiguedad));
					break;
				case 9:
					System.out.println(listado.mostrarListado());
					break;
			}
		}while (opcion != 0);
	}
	
	
	public void finalize()
	{
		teclado.close();
	}

}
