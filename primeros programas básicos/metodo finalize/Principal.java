import gestionDePersonal.Alumno;
import gestionDePersonal.Miembro;

import java.util.*;
public class Principal {

	private static Scanner mtecla;
	
	public static Miembro Copia (Miembro m)
	{
		Miembro mCopia = new Miembro();
		mCopia.setEdad(mtecla.nextInt());
		//	return mCopia;
	}
	
///IMPORTANTE Como crear el metodo pedir en la clase principal:
	public static void pedirD (Miembro m)
	{
		mtecla = new Scanner(System.in);
		System.out.println("inrrt edad");
		m.setEdad(mtecla.nextInt());
	} 
	//pedirD(padre);
	
	public static void main (String [] args)
	{
		Miembro padre = new Miembro();
		Miembro madre = new Miembro();
		Miembro hijo  = new Miembro();
		Miembro hija  = new Miembro();
		
		Scanner tecla = new Scanner(System.in); 
		
		
		System.out.println("\t\t Escriba la dirección de la familia: ");
		Miembro.setDireccion(tecla.nextLine());
	
	
		
		System.out.println("*********************PEDIMOS DATOS*********************************************************");
//		padre.pedirDatos();
//		madre.pedirDatos();
//		hijo.pedirDatos();
//		hija.pedirDatos();
		pedirD(padre);
		
		
		System.out.println("**********************MOSTRAMOS DATOS*********************************************************");
		padre.visualizarDatos();
		madre.visualizarDatos();
		hijo.visualizarDatos();
		hija.visualizarDatos();
		
		System.out.println("*******************CAMBIO DIRECCION************************************************************");
		System.out.println("\t\t Escriba la dirección de la familia: ");
		Miembro.setDireccion(tecla.nextLine());
		
		System.out.println("**********************MOSTRAMOS DATOS*********************************************************");
		padre.visualizarDatos();
		madre.visualizarDatos();
		hijo.visualizarDatos();
		hija.visualizarDatos();
		
		
		
	}
}