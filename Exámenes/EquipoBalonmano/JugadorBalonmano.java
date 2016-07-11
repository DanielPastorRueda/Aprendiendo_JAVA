import java.io.*;

public class JugadorBalonmano extends Deportistas implements Serializable, Comparable<JugadorBalonmano>
{
	private static final long serialVersionUID = -1888377069789579402L;
	
	private int numeroPartidosGanados;
	
	public JugadorBalonmano(String nombre, int nivelDeportivo)
	{
		super(nombre, nivelDeportivo,25);
		this.setNumeroPartidosGanados(0);
	}

	public int getNumeroPartidosGanados()
	{
		return numeroPartidosGanados;
	}

	public void setNumeroPartidosGanados(int numeroPartidosGanados)
	{
		if (numeroPartidosGanados >= 0)
			this.numeroPartidosGanados = numeroPartidosGanados;
		else
			this.numeroPartidosGanados = 0;
	}
	
	
	@Override
	public String toString()
	{
		String cadena = "\n ** JUGADOR BALONMANO ** " + super.toString();
		cadena += " - Numero de Partidos Ganados: " + numeroPartidosGanados;
		
		return cadena;
	}
	
	public int compareTo(JugadorBalonmano otro)
	{
		int resultado = this.valorDeportivoActual() - otro.valorDeportivoActual();
					
		if (resultado == 0)
			resultado = this.nivelDeportivo - otro.nivelDeportivo;
		
		if (resultado == 0)
			resultado = this.nombre.compareTo(otro.nombre);
		
		return resultado;
	}
}