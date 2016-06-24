import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alumno {

	private String nombre;
	private int edad;
	private int telefono;
	
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
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

	
void pedirDatosAlumno()
	{
		String edadCadena;	
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		
		try
		{
			System.out.print("\n\tHola k ase?  ");
			System.out.print("\n\n\tDime tu nombre: ");
			nombre = teclado.readLine();
			System.out.print("\n\n\tAhora dime tu edad: ");
			edadCadena = teclado.readLine();
			edad = Integer.parseInt(edadCadena);
			System.out.print("\n\n\tAhora dame tu teléfono... (el número no el smartphone): ");
			edadCadena = teclado.readLine();
			telefono = Integer.parseInt(edadCadena);
		}
		catch (IOException e)
		{
			System.out.println("tas chalao!! Ha habido un problema en la entrada de datos");
		}
	}
	
	void visualizarDatosAlumno()
	{
		System.out.println("\n\n\tAhi van los datos que has dicho: ");
		//Muestra los datos 
		System.out.println("\n\n\tNOMBRE: " + nombre);
		System.out.println("\n\n\tEDAD: " + edad);
		System.out.println("\n\n\tTELEFONO: " + telefono);
	}
}

