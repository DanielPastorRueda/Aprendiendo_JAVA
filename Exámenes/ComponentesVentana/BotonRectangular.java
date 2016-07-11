
public class BotonRectangular extends Boton
{

	public BotonRectangular(int anchura, int altura, boolean aceptar)
	{
		super(anchura, altura, true, aceptar);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		String cadena = "\n -- BOTON RECTANGULAR --";
		cadena += super.toString();

		return cadena;
	}

//	 -- BOTON RECTANGULAR --
//	 Anchura: 3
//	 Altura: 2
//	 Area: 6.0
//	 Fondo Transparente: SI
//	 Boton ACEPTAR
	
}
