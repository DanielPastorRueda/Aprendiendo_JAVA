//import java.util.Scanner;

import java.util.*;
public class Miembro {
	
	private String nombre;
	private int edad;
	private static String direccion;
	
	Scanner tecla = new Scanner(System.in); 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public static String getDireccion() {
		return direccion;
	}
	public static void setDireccion(String direccion) {
		Miembro.direccion = direccion;
	}
	public void pedirDatos ()
	{
		System.out.println("\t\t Escriba el nombre del miembro: ");
		this.setNombre(tecla.next());
		System.out.println("\t\t Escriba la edad del miembro: ");
		this.setEdad(tecla.nextInt());
	}
	
	
	public void visualizarDatos ()
	{
		System.out.println("El nombre del miembro es " + nombre + ", tiene " +edad + 
							" años y vive en " +direccion);
		getNombre();
		getEdad();
	}
	
	
	protected void finalize()
	{
		System.out.println(" \n\n\t\t HEMOS LIBERAD O UN OBJETO");
		
	}
		
	
}