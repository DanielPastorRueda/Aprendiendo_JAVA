import java.util.*;
import java.io.*;

public class EquipoBalonmano implements Serializable
{
	private static final long serialVersionUID = -4799458081707374290L;
	
	private String nombre;
	private TreeSet<JugadorBalonmano> equipo;
	
	
	public EquipoBalonmano(String nombre)
	{
		this.nombre = nombre;
		equipo = new TreeSet<JugadorBalonmano>();
	}
	
	
	public String getNombre()
	{
		return nombre;
	}


	public boolean ficharJugador(JugadorBalonmano jugador)
	{
		boolean res = true;
		
		equipo.add(jugador);
		
		return res;
	}

	
	public boolean expulsarJugador(String nombre)
	{
		boolean encontrado = false;
		JugadorBalonmano auxiliar;
		Iterator<JugadorBalonmano> iterador = equipo.iterator();
		
		while ((!encontrado) && (iterador.hasNext()))
		{
			auxiliar = iterador.next();
			if (auxiliar.nombre.compareToIgnoreCase(nombre)==0)
			{
				encontrado = true;
				iterador.remove();
			}
		}
		
		return encontrado;
	}
	
	
	public String devolverEquipoValorDeportivoActualAscendente()
	{
		String cadena = " -- Equipo Ordenador por Valor Deportivo Actual Ascendente --";
		cadena += "\nNombre del Equipo: " + this.getNombre();
		
		for (JugadorBalonmano jugador: equipo)
		{
			cadena += "\n" + jugador.toString();
		}
		
		return cadena;
	}
	
	
	public String devolverEquipoValorNombreAscendente()
	{
		String auxiliar;
		ArrayList<JugadorBalonmano> lista = new ArrayList<JugadorBalonmano>();
		String cadena = " -- Equipo Ordenado por Nombre Ascendente --";
		cadena += "\nNombre del Equipo: " + this.getNombre();
		
		for (JugadorBalonmano jugador: equipo)
			lista.add(jugador);
		
		
		for (int indice1 = 0; indice1 < lista.size(); indice1++)
		{
			for (int indice2 = indice1 + 1; indice2 < lista.size(); indice2++)
			{
				if (lista.get(indice1).nombre.compareToIgnoreCase(lista.get(indice2).nombre) > 0)
				{
					auxiliar = lista.get(indice1).nombre;
					lista.get(indice1).setNombre(lista.get(indice2).getNombre());
					lista.get(indice2).setNombre(auxiliar);
				}
			}
		}
		
		for (Deportistas jugador: lista)
		{
			cadena += "\n" + jugador.toString();
		}
		
		return cadena;
	}
	
	
	public int valorDeportivoActualEquipo()
	{
		int total = 0;
		
		for (JugadorBalonmano jugador: equipo)
			total += jugador.valorDeportivoActual();
		
		return total;
	}
	
	
	public void partidoGanado()
	{
		for (JugadorBalonmano jugador : equipo)
		{
			jugador.setNumeroPartidosGanados(jugador.getNumeroPartidosGanados() + 1);
			if (jugador.getNumeroPartidosGanados() % 3 == 0)
				jugador.setRendimientoActual(jugador.getRendimientoActual() + 5);
		}
	}
	
	public static EquipoBalonmano partido(EquipoBalonmano equipo1, EquipoBalonmano equipo2)
	{
		EquipoBalonmano equipo = null;
		
		int resultado = (equipo1.valorDeportivoActualEquipo() - equipo2.valorDeportivoActualEquipo());
		
		if (resultado > 0)
		{
			equipo = equipo1;
			equipo1.partidoGanado();
		}
		else if (resultado < 0)
		{
			equipo = equipo2;
			equipo2.partidoGanado();
		}
		
		return equipo;
	}
}