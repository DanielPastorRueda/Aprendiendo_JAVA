package Polinomio;
import java.util.*;

public class CPolinomio
{
	private ArrayList<CTermino> polinomio;
	
	public CPolinomio()
	{
		polinomio = new ArrayList<CTermino>();
	}
	
	public int tamano()
	{
		return polinomio.size();
	}
	
	public CTermino getTermino(int pos)
	{
		return polinomio.get(pos);
	}
	
	public boolean añadirTermino(CTermino termino)
	{
		int indice = 0;
			
				// mientras que haya espacio Y  -- la primera posicion(0).deX sea mayor que el termino
		while (indice < polinomio.size() && (polinomio.get(indice).getExponenteX() > termino.getExponenteX()))
			indice++;
				
		while ((indice < polinomio.size()) && (polinomio.get(indice).getExponenteX() == termino.getExponenteX()) && (polinomio.get(indice).getExponenteY() > termino.getExponenteY()))
			indice++;
		
		if ((indice < polinomio.size()) && (polinomio.get(indice).getExponenteX() == termino.getExponenteX()) && (polinomio.get(indice).getExponenteY() == termino.getExponenteY()))
			polinomio.get(indice).setCoeficiente(polinomio.get(indice).getCoeficiente() + termino.getCoeficiente());
		else
			polinomio.add(indice, termino);
		
		return true;
	}
	
	public static CPolinomio sumaPolinomios(CPolinomio polin1, CPolinomio polin2)
	{
		CPolinomio resultado = new CPolinomio();
		
		int indice1 = 0;
		int indice2 = 0;
		
		while ((indice1 < polin1.tamano()) && (indice2 < polin2.tamano()))
		{
			if (polin1.getTermino(indice1).getExponenteX() > polin2.getTermino(indice2).getExponenteX())
				resultado.añadirTermino(polin1.getTermino(indice1++));
			else if ((polin1.getTermino(indice1).getExponenteX() < polin2.getTermino(indice2).getExponenteX()))
				resultado.añadirTermino(polin2.getTermino(indice2++));
			else
			{
				if (polin1.getTermino(indice1).getExponenteY() > polin2.getTermino(indice2).getExponenteY())
					resultado.añadirTermino(polin1.getTermino(indice1++));
				else if ((polin1.getTermino(indice1).getExponenteY() < polin2.getTermino(indice2).getExponenteY()))
					resultado.añadirTermino(polin2.getTermino(indice2++));
				else
				{
					CTermino nuevo = new CTermino(polin1.getTermino(indice1).getCoeficiente() + polin2.getTermino(indice2).getCoeficiente(),
										polin1.getTermino(indice1).getExponenteX(), polin1.getTermino(indice1).getExponenteY());
					resultado.añadirTermino(nuevo);
					indice1++;
					indice2++;
				}
			}
			
			while (indice1 < polin1.tamano())
				resultado.añadirTermino(polin1.getTermino(indice1++));
			
			while (indice2 < polin2.tamano())
				resultado.añadirTermino(polin2.getTermino(indice2++));
		}
		return resultado;
	}
	
	@Override
	public String toString()
	{
		String cadena = "";
		
		for (CTermino termino: polinomio)
		{
			cadena += termino.toString();
		}
		
		return cadena;
	}
}