
public class Principal {

	public static void main(String[] args) 
	{
		Alumno a1;
		a1 = new Alumno();
		// Porque empezamos por escribir por "Alumno"?		
		//Es lo mismo Alumno alu1 = new alumno ();
		
		
//se pueden coger de "Alumno.java" porque las he declarado publicas", pero no podemos tocar directamente la edad,telefono y nombre
//esto es lo que hace el programa: pide lo datos y los muestra		
		a1.pedirDatosAlumno();
		a1.visualizarDatosAlumno();


	}			
}
