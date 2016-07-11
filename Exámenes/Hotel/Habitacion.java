public class Habitacion
{
	private int numero;
	private double superficie;
	private double preciom2;
	private boolean vistasexteriores;
	
	
	public Habitacion(int num, double sup, double prem2, boolean vext)
	{
		this.setNumero(num);
		this.setSuperficie(sup);
		this.setPrecioM2(prem2);
		this.setVistasexteriores(vext);
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public double getSuperficie()
	{
		return superficie;
	}

	public void setSuperficie(double superficie)
	{
		this.superficie = superficie;
	}

	public double getPrecioM2()
	{
		return preciom2;
	}

	public void setPrecioM2(double precio)
	{
		this.preciom2 = precio;
	}

	public boolean isVistasexteriores()
	{
		return vistasexteriores;
	}

	public void setVistasexteriores(boolean vistasexteriores)
	{
		this.vistasexteriores = vistasexteriores;
	}
	
	public double precio()
	{
		return this.getSuperficie() * this.getPrecioM2();
	}
	
	@Override
	public String toString()
	{	
		String cadena = "";
	
		cadena = "\n\nHabitacion [" + getNumero() + "]" 
				+ "\nSuperficie: " + getSuperficie() 
				+ (isVistasexteriores()? "\nCon Vistas Exteriores":"\nCon Vistas Interiores")
				+ "\nPrecio de la Habitacion: " + precio();
		
		return cadena;
	}
}
