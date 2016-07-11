
public class Ficha 
{
	private String color;
	private int identificador;
	
	public Ficha ( String color, int id) 
	{
		this.color=color;
		identificador=id;
	}

	public Ficha() 
	{
	
	}
	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public int getIdentificador() 
	{
		return identificador;
	}

	public void setIdentificador(int identificador) 
	{
		this.identificador = identificador;
	}
	
	public String toString()
	{
		String pos;
		int x=0;
		x=color.compareToIgnoreCase("blanco");

		if(identificador==1)pos="T";
		else if(identificador==2)pos="P";
		else pos="";
		
		if(x==0)pos=pos+"B";
		else if(x!=0)pos=pos+"N";
		else pos=pos+"";
		return pos;
	}
}
