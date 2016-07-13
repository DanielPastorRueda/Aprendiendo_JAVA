
public class Profesor extends Persona
{
	private int antiguedad;

	
	public Profesor(String nif, String nombre, int edad,int antiguedad)
	{
		super(nif,nombre,edad);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad()
	{
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad)
	{
		if (antiguedad >= 0)
			this.antiguedad = antiguedad;
	}
	
	@Override
	public String toString()
	{
		String cadena = "\n -- PROFESOR --" + super.toString();
		cadena += "\nAntiguedad: " + this.antiguedad;
		
		return cadena;
	}	
}