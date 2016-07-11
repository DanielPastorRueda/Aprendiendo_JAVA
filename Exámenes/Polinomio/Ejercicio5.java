package Polinomio;

public class Ejercicio5
{

	public static void main(String[] args)
	{
		CPolinomio polinomio1 = new CPolinomio();
		CPolinomio polinomio2 = new CPolinomio();
		CPolinomio polinomio3;
		
		polinomio1.añadirTermino(new CTermino(2,3,1));
		polinomio1.añadirTermino(new CTermino(-1,1,3));
		polinomio1.añadirTermino(new CTermino(8.25,0,0));
		
		polinomio2.añadirTermino(new CTermino(7,2,0));
		polinomio2.añadirTermino(new CTermino(-2,3,1));
		polinomio2.añadirTermino(new CTermino(5,5,1));
		polinomio2.añadirTermino(new CTermino(-3,0,0));
		
		
		System.out.println(polinomio1.toString());
		System.out.println(polinomio2.toString());
		polinomio3 = CPolinomio.sumaPolinomios(polinomio1, polinomio2);
		System.out.println(polinomio3.toString());
		
	}

}
