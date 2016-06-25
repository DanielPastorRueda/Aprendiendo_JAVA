import java.util.*;
public class Ejercicio2
{
	public static int menu()
	{
		Scanner teclado = new Scanner(System.in);
		int opcion;
		
		do
		{
			System.out.println("\n\n -- MENU ---");
			System.out.println(" 1. Suma de digitos");
			System.out.println(" 0. Salir");
			System.out.print(" Introduzca una opcion: ");
			opcion = teclado.nextInt();
		}while ((opcion < 0) || (opcion > 1));
		
		return opcion;
	}
	
	public static int longitudEntero(int num)
	{
		int longi = 1;
		
		while (num > 9)
		{
			num = num / 10;
			longi++;
		}
		
		return longi;
	}
	
	public static int cifraEnEntero(int num, int pos)
	{
		int cifra = 0;
		int longi = longitudEntero(num);
		
		for (int cont = 1; cont <= longi - pos; cont++)
			num = num/10;
		
		cifra = num%10;
		
		return cifra;
	}
	
	
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma = 0;
		int opcion = 0;
		
		do
		{
			opcion = menu();
			switch (opcion)
			{
			case 1:
				do
				{
					System.out.print("Introduzca un numero natural: ");
					numero = teclado.nextInt();
				}while (numero < 0);
				suma = 0;
				System.out.print(" " + cifraEnEntero(numero,1));
				suma = cifraEnEntero(numero,1);
				for (int cont = 2; cont <= longitudEntero(numero); cont++)
				{
					suma += cifraEnEntero(numero,cont);
					System.out.print(" + " + cifraEnEntero(numero,cont));
				}
				System.out.print(" = " + suma);
				break;
			}
		}while (opcion != 0);
	}
	
}
