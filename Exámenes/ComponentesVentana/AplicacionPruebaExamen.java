public class AplicacionPruebaExamen
{
	/* La siguiente aplicación es una prueba para comprobar el uso de las clases creadas en el examen */
	
	public static void main(String[] args)
	{
		// Creamos dos elemento de la clase etiqueta (etiqueta1 - etiqueta2)
		Etiqueta et1 = new Etiqueta(20,4,false,"etiqueta1");
		Etiqueta et2 = new Etiqueta(12,2,true,"etiqueta2");
		
		// Creamos dos elementos de la clase boton rectangular
		BotonRectangular btrct1 = new BotonRectangular(3,2,true);
		BotonRectangular btrct2 = new BotonRectangular(2,1,false);
		
		// Creamos dos elementos de la clase boton rectangular
		BotonTriangular bttr1 = new BotonTriangular(3,2,true,true);
		BotonTriangular bttr2 = new BotonTriangular(2,1,false,true);
		
		// Finalmente, creamos dos elementos de la clase ventana y le añadimos diferentes elementos
		Ventana vent1 = new Ventana(30,30,true,15);
		vent1.anyadirComponente(et1);
		vent1.anyadirComponente(btrct1);
		vent1.anyadirComponente(btrct2);
		
		Ventana vent2 = new Ventana(40,40,false,5);
		vent2.anyadirComponente(et2);
		vent2.anyadirComponente(bttr1);
		vent2.anyadirComponente(bttr2);
		
		
		/* Mostramos los datos de la ventana1, en la que también apareceran los datos de etiqueta1,
		 * botonrectangular1 y botonrectangular2 */
		System.out.println(vent1.toString() + "\n\n");
		
		/* Mostramos los datos de la ventana2, en la que también apareceran los datos de etiqueta2,
		 * botontriangular1 y botontriangular2 */
		System.out.println(vent2.toString());
	}
}
