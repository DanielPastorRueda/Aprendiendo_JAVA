
public class Alumno extends Persona
{
	private double nota;
	
	
	public Alumno(String nif, String nombre, int edad, double nota)
	{
		super(nif, nombre, edad);
		this.nota = nota;
	}

	public double getNota()
	{
		return nota;
	}

	public void setNota(double nota)
	{
		if ((nota >= 0) && (nota <= 10))
			this.nota = nota;
	}

	@Override
	public String toString()
	{
		String cadena = "\n -- ALUMNO --" + super.toString();
		cadena += "\nNota: " + this.nota;
		
		return cadena;
	}
}