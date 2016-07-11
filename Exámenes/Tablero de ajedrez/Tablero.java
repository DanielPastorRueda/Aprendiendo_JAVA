
public class Tablero 
{
	private Ficha[][] tablero;
	
	public Tablero(int tam)
	{
		tablero=new Ficha[tam][tam];
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero[i].length;j++)
			{
				tablero[i][j]=new Ficha();
			}
		}		
	}
	
	public boolean estaVacio()
	{
		boolean vacio = true;
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero[i].length;j++)
			{
				if(tablero[i][j]!=null)vacio=false;
			}
		}
			
		return vacio;
	}
	
	public boolean colocarFicha(Ficha f,int fil,int col)
	{
		boolean coloca=false;
		if(fil>0 && fil<tablero.length && col>0 && col<tablero.length)
		{
			tablero[fil][col]=f;
			coloca=true;
		}
		return coloca;
	}
	
	public String pintarTableroSinPosibilidades()
	{
		String tab = "";
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero[i].length;j++)
			{
				tab=tab+"["+tablero[i][j].toString()+"]\t";
			}
			tab=tab+"\n";
		}
		return tab;
	}
	
	public String pintarTableroConPosibilidades()
	{
		String tab = null;
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero[i].length;j++)
			{
				if(tablero[i][j].getIdentificador()==2)
				{
					System.out.print(pintarTableroPeon());
				}
				if(tablero[i][j].getIdentificador()==1)
				{
					System.out.print(pintarTableroTorre());
				}
			}
			tab=tab+"\n";
		}
		return tab;
	}
	
	private String pintarTableroPeon()
	{
		String tabP = null;
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero[i].length;j++)
			{
				if(tablero[i-1][j]!=null && tablero[i-1][j].getIdentificador()==2)
				{
					tabP=tabP+"[--]\t";
				}
				else tabP=tabP+"["+tablero[i][j].toString()+"]\t";
			}
		}
		return tabP;
	}
	
	private String pintarTableroTorre()
	{
		String tabT = null;
		int fil=buscarFila();
		int col=buscarCol();
		
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero[i].length;j++)
			{
				if(i==fil)
				{
					tabT=tabT+"[--]\t";
				}
				else tabT=tabT+"[ ]\t";
				if(j==col)
				{
					tabT=tabT+"[--]\t";
				}
				else tabT=tabT+"[ ]\t";
				if(i==fil && col==j)tabT=tabT+"["+tablero[i][j].toString()+"]\t";
			}
		}
		return tabT;
	}
	
	private int buscarFila()
	{
		int fila = (Integer) null;
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero[i].length;j++)
			{
				if(tablero[i][j]!=null)fila=i;
			}
		}
		return fila;
	}
	
	private int buscarCol()
	{
		int col =(Integer) null;
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero[i].length;j++)
			{
				if(tablero[i][j]!=null)col=j;
			}
		}
		return col;
	}
}
