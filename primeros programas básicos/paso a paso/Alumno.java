import java.util.*;
import java.io.*;
public class Alumno {

	private String nombre;
	private int edad;
	private String nombreCurso;
	
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
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public void mostrarInfo() {
		System.out.println("***********************************************");
		System.out.println("** \t CURSO  : \t\t " + getNombreCurso()		);
		System.out.println("** \t NOMBRE : \t\t " + getNombre()				);
		System.out.println("** \t EDAD   : \t\t " + getEdad()  				);
		System.out.println("***********************************************");

	}
	
}
