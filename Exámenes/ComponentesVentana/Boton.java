
public class Boton extends Componente
{
	private boolean aceptar;


	public Boton(int anchura, int altura, boolean transparencia, boolean aceptar)
	{
		super(anchura, altura, transparencia);
		this.aceptar = aceptar;
	}		
	
	
	public boolean isAceptar()
	{
		return aceptar;
	}
	
	public void setAceptar(boolean aceptar)
	{
		this.aceptar = aceptar;
	}
	
	@Override
	public String toString()
		{
			String cadena = super.toString();
			cadena += (isAceptar()?"\nBoton ACEPTAR":"\nBoton DENEGAR");
			
			return cadena;
		}
	
	
//	public static void main(String[] args)
//	{
//		
//	}
	
//	 -- BOTON RECTANGULAR --
//	 Anchura: 3
//	 Altura: 2
//	 Area: 6.0
//	 Fondo Transparente: SI
//	 Boton ACEPTAR
//
//	  -- BOTON RECTANGULAR --
//	 Anchura: 2
//	 Altura: 1
//	 Area: 2.0
//	 Fondo Transparente: SI
//	 Boton DENEGAR
}
