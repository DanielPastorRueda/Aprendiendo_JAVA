public class Aplicacion
{
	public static void main(String[] args)
	{
		// Creación del primer hotel. Primero creamos las distintas habitaciones
		Habitacion hab1 = new Habitacion(101,10,5,true);
		Habitacion hab2 = new Habitacion(102,10,5,false);
		Habitacion hab3 = new Habitacion(103,10,5,true);
		HabitacionEmpresario hab4 = new HabitacionEmpresario(104,12,7,true);
		HabitacionEmpresario hab5 = new HabitacionEmpresario(105,10,7,true);
		Suite hab6 = new Suite(201,15,10,2,true);
		Suite hab7 = new Suite(202,19,10,1,false);
		SuiteNupcial hab8 = new SuiteNupcial(204,25,20,2,false);
		// Creamos el hotel de tamaño 8 e insertamos todas las habitaciones
		Hotel hotel1 = new Hotel(8);
		hotel1.insertarHabitacion(hab1);
		hotel1.insertarHabitacion(hab2);
		hotel1.insertarHabitacion(hab3);
		hotel1.insertarHabitacion(hab4);
		hotel1.insertarHabitacion(hab5);
		hotel1.insertarHabitacion(hab6);
		hotel1.insertarHabitacion(hab7);
		hotel1.insertarHabitacion(hab8);
		System.out.print("      HOTEL 1");

		// Mostrar información de la habitación 204 y de una habitación (304) que no existe
		System.out.println(hotel1.mostrarInfoHabitacion(204));
		System.out.println(hotel1.mostrarInfoHabitacion(304));
		// Mostrar información sobre los m2 de las suites nupciales
		System.out.printf("\nEl total de m2 de todas las Suites Nupciales es %.2f\n", hotel1.mostarM2SuitesNupciales());
		// Mostrar informacion sobre las suites con más de un aseo
		System.out.println(hotel1.mostrarHabitacionesAseos());
		
		
		// Creamos un nuevo hotel
		Hotel hotel2 = new Hotel(2);
		Suite hab9 = new Suite(1,25,25,3,false);
		SuiteNupcial hab10 = new SuiteNupcial(2,30,100,2,true);
		hotel2.insertarHabitacion(hab9);
		hotel2.insertarHabitacion(hab10);
		
		
		System.out.print("\n      HOTEL 3");
		// Fusionamos los hoteles en un nuevo objeto hotel3
		Hotel hotel3 = Hotel.union(hotel1,hotel2);
		// Mostrar información de la habitación 204 y de una habitación (304) que no existe
		System.out.println(hotel3.mostrarInfoHabitacion(204));
		System.out.println(hotel3.mostrarInfoHabitacion(1));
		// Mostrar información sobre los m2 de las suites nupciales
		System.out.printf("\nEl total de m2 de todas las Suites Nupciales es %.2f", hotel3.mostarM2SuitesNupciales());
		// Mostrar informacion sobre las suites con más de un aseo
		System.out.println(hotel3.mostrarHabitacionesAseos());
		
		
		
		
		

	}

}
