public abstract class Persona implements Comparable<Persona>
{
	private String nif;
	private String nombre;
	private int edad;
	
	
	public Persona(String nif, String nombre, int edad)
	{
		this.nif = nif;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNif()
	{
		return nif;
	}
	
	public void setNif(String nif)
	{
		this.nif = nif;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edad)
	{
		if (edad >= 0)
			this.edad = edad;
	}
	
	@Override
	public String toString()
	{
		return 	"\nNIF: " + getNif() + 
				"\nNombre: " + getNombre() + 
				"\nEdad: " + getEdad();
	}

	@Override
	public int compareTo(Persona arg0)
	{
		return nif.compareTo(arg0.getNif());
	}
}