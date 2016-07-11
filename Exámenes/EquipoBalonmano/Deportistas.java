import java.io.Serializable;

public abstract class Deportistas implements Serializable
{
	private static final long serialVersionUID = 7811171830708615933L;
	
	protected String nombre;
	protected int nivelDeportivo;
	protected int rendimientoActual;
	
	public Deportistas(String nombre, int nivelDeportivo, int rendimientoActual)
	{
		super();
		this.setNombre(nombre);
		this.setNivelDeportivo(nivelDeportivo);
		this.setRendimientoActual(rendimientoActual);
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getNivelDeportivo()
	{
		return nivelDeportivo;
	}

	public void setNivelDeportivo(int nivelDeportivo)
	{
		if ((nivelDeportivo >= 0) && (nivelDeportivo <= 100))
			this.nivelDeportivo = nivelDeportivo;
		else if (nivelDeportivo < 0)
			this.nivelDeportivo = 0;
		else
			this.nivelDeportivo = 100;
	}
	
	public int getRendimientoActual()
	{
		return rendimientoActual;
	}

	public void setRendimientoActual(int rendimientoActual)
	{
		if ((rendimientoActual >= 0) && (rendimientoActual <= 100))
			this.rendimientoActual = rendimientoActual;
		else if (rendimientoActual < 0)
			this.rendimientoActual = 0;
		else
			this.rendimientoActual = 100;
	}
	
	public int valorDeportivoActual()
	{
		return (int)(nivelDeportivo * (rendimientoActual/100.0));
	}

	@Override
	public String toString()
	{
		return "Nombre: " + this.nombre + " - Nivel Deportivo: " + this.nivelDeportivo + " - Rendimiento Actual: " + this.rendimientoActual + 
			   " - Nivel Deportivo Actual: " + this.valorDeportivoActual();
	}
}