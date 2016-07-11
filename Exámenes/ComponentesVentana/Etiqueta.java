
public class Etiqueta extends Componente
{

	private String texto;

	
	public Etiqueta(int anchura, int altura, boolean transparencia, String texto)
	{
		super(anchura, altura, transparencia);
		this.texto = texto;
	}

	public String getTexto()
	{
		return texto;
	}

	public void setTexto(String texto)
	{
		this.texto = texto;
	}
	
	@Override
	public String toString()
		{
			String cadena = "\n-- ETIQUETA --";
			
			cadena += super.toString();
			cadena += "\nTexto: " + this.getTexto();
			
			return cadena;
		}
	
	

	
	public static void main(String[] args)
	{
			// Creamos dos elemento de la clase etiqueta (etiqueta1 - etiqueta2)
			Etiqueta et1 = new Etiqueta(20,4,false,"etiqueta1");
			
			System.out.println(et1);
	}
	
//	 -- ETIQUETA --
//	 Anchura: 20
//	 Altura: 4
//	 Area: 80.0
//	 Fondo Transparente: NO
//	 Texto: etiqueta1
	
}
