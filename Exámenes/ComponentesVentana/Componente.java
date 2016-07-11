
public class Componente implements InterfazExamen
{
	private int anchura;
	private int altura;
	private boolean transparencia;
	
	
	
	public Componente(int anchura, int altura, boolean transparencia)
	{
		this.anchura = anchura;
		this.altura = altura;
		this.transparencia = transparencia;
	}


	public int getAnchura()
	{
		return anchura;
	}


	public void setAnchura(int anchura)
	{
		this.anchura = anchura;
	}


	public int getAltura()
	{
		return altura;
	}


	public void setAltura(int altura)
	{
		this.altura = altura;
	}


	public boolean isTransparencia()
	{
		return transparencia;
	}


	public void setTransparencia(boolean transparencia)
	{
		this.transparencia = transparencia;
	}


	@Override
	public double area()
	{
		// TODO Auto-generated method stub
		double area = this.altura * this.anchura; 
		
		return area;
	}

	
	public String toString()
	{
		String cadena = "";
		
		cadena += "\nAnchura: " 			+ this.getAnchura()
				+ "\nAltura: " 			+ this.getAltura()
				+ "\nArea: "	 			+ area()
				+ (isTransparencia()?"\nFondo Transparente: SI":"\nFondo Transparente: NO");
		
		return cadena;
	}

	
	
//
//Anchura: 20
//Altura: 4
//Area: 80.0
//Fondo Transparente: NO
//
//	//test de Componente
//		
//	public static void main(String[] args)
//	{
//		Componente a = new Componente(20,4,false);
//
//		System.out.println(a.toString());
//	}
// 
}
