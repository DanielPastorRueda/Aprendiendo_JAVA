//importo las clases necesarias
import java.util.*;
import java.io.*;

//Creo la clase "Principal" que es la que guia el codigo
public class Principal 
{
//Esta clase se declara como principal así:
public static void main (String [] args)
{
//Mensaje binevenida
	System.out.println("\n\t\t\t *Bienvenido a la aplicación DPR*");

// Arranco el lector del teclado, para poder llamarlo luego
	Scanner teclado = new Scanner(System.in);

//Inicializo los 5 alumnos.
	Alumno alu1 , alu2, alu3, alu4, alu5;

//Declaro los 5 alumnos.
	alu1 = new Alumno();
	alu2 = new Alumno();
	alu3 = new Alumno();
	alu4 = new Alumno();
	alu5 = new Alumno();

//Solicito Datos de los cursos
	System.out.println("\n\t Introduzca el nombre del Curso A");
	alu1.setNombreCurso(teclado.next());
	alu2.setNombreCurso(alu1.getNombreCurso());
	alu3.setNombreCurso(alu1.getNombreCurso());	
	System.out.println("\n\t Introduzca el nombre del Curso B");
	alu4.setNombreCurso(teclado.next());
	alu5.setNombreCurso(alu4.getNombreCurso());
	
//Solicito Datos de Alumnos
	System.out.println("\n\t Escriba la edad del alumno1");	
	alu1.setEdad(teclado.nextInt());
	System.out.println("\n\t Escriba la edad del alumno2");
	alu2.setEdad(teclado.nextInt());
	System.out.println("\n\t Escriba la edad del alumno3");
	alu3.setEdad(teclado.nextInt());
	System.out.println("\n\t Escriba la edad del alumno4");
	alu4.setEdad(teclado.nextInt());
	System.out.println("\n\t Escriba la edad del alumno5");
	alu5.setEdad(teclado.nextInt());

//Pido los datos de nombre por cada alumno.
	System.out.println("\n\t Introduzca el nombre del Alumno1");
	alu1.setNombre(teclado.next());
	System.out.println("\n\t Introduzca el nombre del Alumno2");
	alu2.setNombre(teclado.next());
	System.out.println("\n\t Introduzca el nombre del Alumno3");
	alu3.setNombre(teclado.next());
	System.out.println("\n\t Introduzca el nombre del Alumno4");
	alu4.setNombre(teclado.next());
	System.out.println("\n\t Introduzca el nombre del Alumno5");
	alu5.setNombre(teclado.next());	

//Ahora, muestro los datos de todos:	
	System.out.println("\n\t Datos del Alumno1");
	alu1.mostrarInfo();
	System.out.println("\n\t Datos del Alumno2");
	alu2.mostrarInfo();
	System.out.println("\n\t Datos del Alumno3");
	alu3.mostrarInfo();
	System.out.println("\n\t Datos del Alumno4");
	alu4.mostrarInfo();
	System.out.println("\n\t Datos del Alumno5");
	alu5.mostrarInfo();

//Ahora, establezco un curso nuevo donde 2 alumnos se apuntan:
	System.out.println("\n\t ** Acontecimiento: ** \n\t\t Nuevo curso disponible");
	System.out.println("\n\t Introduzca el nombre del Curso C");
	alu1.setNombreCurso(teclado.next());
	alu5.setNombreCurso(alu1.getNombreCurso());
	
//Ahora, muestro los datos de todos:	
	System.out.println("\n\t Datos del Alumno1");
	alu1.mostrarInfo();
	System.out.println("\n\t Datos del Alumno2");
	alu2.mostrarInfo();
	System.out.println("\n\t Datos del Alumno3");
	alu3.mostrarInfo();
	System.out.println("\n\t Datos del Alumno4");
	alu4.mostrarInfo();
	System.out.println("\n\t Datos del Alumno5");
	alu5.mostrarInfo();		

}
}
