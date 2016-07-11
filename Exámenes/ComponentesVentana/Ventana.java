
public class Ventana extends Componente
{
	private Componente [] contenedor;
	private int indiceCont; //Elementos
	
	
	public Ventana(int anchuraV, int alturaV, boolean transparenciaV, int numComponentes)
	{
		super(anchuraV, alturaV, transparenciaV);
		if (numComponentes < 1 )
		{
			numComponentes=5; // por defecto contendrá 5
		}
		
		contenedor = new Componente[numComponentes];
		this.indiceCont = 0;

	}

	public void anyadirComponente(Componente elemento)
	{
		if (this.indiceCont < contenedor.length )
		{
			this.contenedor[this.indiceCont] = elemento;
			this.indiceCont++;
		}else
			System.err.println("El contenedor está lleno de elementos y no se ha podido añadir ninguno mas a la ventana"); 
	   //no es un .out. es un .err. -- ¿¿esto si me dejas hacerlo en cualquier clase, aunq no sea principal??
	}
	
	public double areaTotalComponentes()
	{
		double areaTotal = 0;
		
		for (int indice = 0; indice < indiceCont; indice++)
		{
			areaTotal += contenedor[indice].area();
		} 
		
		return areaTotal;
	}
	
	
	public String toString()
	{
		String cadena = "\n-- VENTANA --";
		cadena += super.toString();

		cadena += "\n\n Area total de los componentes de la ventana: "+areaTotalComponentes();
		cadena += "\n\n -- COMPONENTES DE LA VENTANA --";
		
		for (int ind = 0 ; ind < indiceCont ; ind++)
		{
			cadena += "\n"+contenedor[ind].toString();
		}

		return cadena;
	}
	
	

	

//	 -- VENTANA --
//	 Anchura: 30
//	 Altura: 30
//	 Area: 900.0
//	 Fondo Transparente: SI
//
//	  Area total de los componentes de la ventana: 88.0
//
//	  -- COMPONENTES DE LA VENTANA --
//
//	  -- ETIQUETA --
//	 Anchura: 20
//	 Altura: 4
//	 Area: 80.0
//	 Fondo Transparente: NO
//	 Texto: etiqueta1
//
//	  -- BOTON RECTANGULAR --
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
