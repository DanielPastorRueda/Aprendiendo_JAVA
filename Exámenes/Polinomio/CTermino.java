package Polinomio;
public class CTermino
{
	private double coeficiente;
	private int exponenteX;
	private int exponenteY;
		
	public CTermino(double coeficiente, int exponenteX, int exponenteY)
	{
		// super();
		this.coeficiente = coeficiente;
		this.exponenteX = exponenteX;
		this.exponenteY = exponenteY;
	}

	public double getCoeficiente()
	{
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente)
	{
		this.coeficiente = coeficiente;
	}

	public int getExponenteX()
	{
		return exponenteX;
	}

	public void setExponenteX(int exponenteX)
	{
		this.exponenteX = exponenteX;
	}

	public int getExponenteY()
	{
		return exponenteY;
	}

	public void setExponenteY(int exponenteY)
	{
		this.exponenteY = exponenteY;
	}

	public String toString()
	{
		String cadena = " ";
		
		if (coeficiente != 0)
		{
			if (coeficiente > 0)
				cadena = " +";
			
			cadena += coeficiente;
			
			if (exponenteX != 0)
			{
				if (exponenteX > 1)	
					cadena += "X^" + exponenteX;
				else
					cadena += "X";
			}
			
			if (exponenteY != 0)
			{
				if (exponenteY > 1)
					cadena += "Y^" + exponenteY;
				else
					cadena += "Y";
			}
		}
		return cadena;
	}
}
