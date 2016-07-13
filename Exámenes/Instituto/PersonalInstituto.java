import java.util.*;

public class PersonalInstituto
{
	private TreeSet<Persona> listado;
	private int numAlumnos;
	private int numProfesores;
	
	
	public PersonalInstituto()
	{
		listado = new TreeSet<Persona>();
		numAlumnos = 0;
		numProfesores = 0;
	}
	
	
	public int numeroAlumnos()
	{
		return this.numAlumnos;
	}
	
	
	public int numeroProfesores()
	{
		return this.numProfesores;
	}
	
	
	public boolean insertarPersona(Persona pers)
	{
		boolean res = false;
		
		if (pers instanceof Alumno)
		{
			listado.add(pers);
			res = true;
			numAlumnos++;
		}
		else if (pers instanceof Profesor)
		{
			listado.add(pers);
			res = true;
			numProfesores++;
		}
		
		return res;
	}
	
	
	public boolean estaPersona(String nif)
	{
		boolean res = false;
		
		for (Persona personaListado : listado)
		{
			if (personaListado.getNif().compareTo(nif) == 0)
				res = true;
		}
		
		return res;
	}
	
	
	public void eliminarPersona(String nif)
	{
		Iterator<Persona> iterador = listado.iterator();
		Persona pers;
		
		while (iterador.hasNext())
		{
			pers = iterador.next();
			if (pers.getNif().compareTo(nif) == 0)
			{
				iterador.remove();
				if (pers instanceof Alumno)
					numAlumnos--;
				else
					numProfesores--;
			}
		}
	}
	
	
	public String mostrarPersonaPorNombre(String nombre)
	{
		String res = "";
		
		for (Persona personaListado : listado)
		{
			if (personaListado.getNombre().compareToIgnoreCase(nombre) == 0)
				res += personaListado.toString();
		}
		
		return res;
	}
	
	
	public double notaMediaAlumnosMenoresDe(int edad)
	{
		int contador = 0;
		double sumaNotas = 0;
		double res = 0;
		
		
		for (Persona personaListado : listado)
		{
			if (personaListado instanceof Alumno)
			{
				if (personaListado.getEdad() < edad)
				{
					sumaNotas += ((Alumno)personaListado).getNota();
					contador++;
				}
			}
		}
		
		if (contador != 0)
			res = sumaNotas / contador;
		
		return res;
	}
	
	
	public double edadMediaProfesoresAntiguedadMayor(int antiguedad)
	{
		int contador = 0;
		double sumaEdad = 0;
		double res = 0;
		
		
		for (Persona personaListado : listado)
		{
			if (personaListado instanceof Profesor)
			{
				if (((Profesor)personaListado).getAntiguedad() > antiguedad)
				{
					sumaEdad += personaListado.getEdad();
					contador++;
				}
			}
		}
		
		if (contador != 0)
			res = sumaEdad / contador;
		
		return res;
	}
	
	public String mostrarListado()
	{
		String res = "";
		
		for (Persona personaListado : listado)
		{
			res += personaListado.toString();
		}
		
		return res;
	}
}
