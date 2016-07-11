
public class BotonTriangular extends Boton
{

	public BotonTriangular(int anchura, int altura, boolean transparencia,boolean aceptar)
	{
		super(anchura, altura, transparencia, aceptar);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double area()
	{
		double areaTri = (super.area()/2); 
		return areaTri;
	}



	public String toString()
	{
		String cadena = "\n -- BOTON TRIANGULAR --";
		cadena += super.toString();

		return cadena;
	}
	
	
	
//	public static void main(String[] args)
//	{
//		BotonTriangular bttr1 = new BotonTriangular(3,2,true,true);
//		
//		System.out.println(bttr1);
//	}
//	
//	 -- BOTON TRIANGULAR --
//	 Anchura: 3
//	 Altura: 2
//	 Area: 3.0
//	 Fondo Transparente: SI
//	 Boton ACEPTAR
	
}
