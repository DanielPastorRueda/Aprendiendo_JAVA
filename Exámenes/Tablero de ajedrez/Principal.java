import java.util.*;
public class Principal 
{
	public static void crea(Ficha f)
	{
		Scanner tc = new Scanner(System.in);
		f=new Ficha();
		String color;
		String tipo;
	
		do
		{
			System.out.println("Introduzca color: ");
			color=tc.next();
			System.out.println("Introduzca tipo: ");
			tipo=tc.next();
		}while(tipo.charAt(0)!='P' && tipo.charAt(0)!='T' && color.compareToIgnoreCase("blanco")==0 && color.compareToIgnoreCase("negro")==0);
		f.setColor(color);
		int id;
		if(tipo.charAt(0)!='P')id=2;
		else id=1;
		f.setIdentificador(id);
	}
	
	public static void coloca(Tablero t,Ficha f,int x)
	{
		int fil,col;
		Scanner tc = new Scanner(System.in);
		System.out.println("Introduzca numero de fila:");
		fil=tc.nextInt();
		System.out.println("Introduzca numero de columna:");
		col=tc.nextInt();
		if(t.colocarFicha(f,fil-1,col-1))System.out.println("Colocacion correcta\n");
		else System.out.println("Colocacion incorrecta\n");
	}
	
	
	public static void main(String[] args) 
	{
		int x;
		Scanner tc = new Scanner(System.in);
		Ficha f = null;
		do
		{
			System.out.print("Introduzca numero de filas y columnas:");
			x=tc.nextInt();
		}while(x<2);
		Tablero tab= new Tablero(x);
		
		///////---------MENU--------///////
		int op = 0;
		do
		{
			System.out.println("Menu");
			System.out.println("-------------");
			System.out.println("1. Colocar Ficha");
			System.out.println("2. Mostrar tablero sin movimientos");
			System.out.println("3. Mostrar tablero con movimientos");
			System.out.println("4. Salir");
			op=tc.nextInt();
			if(op==1)
			{
				crea(f);
				coloca(tab,f,x);
			}
			else if(op==2)System.out.println(tab.pintarTableroSinPosibilidades());
			else if(op==3)tab.pintarTableroConPosibilidades();
			else if(op==4)System.out.println("Saliendo");
			else System.out.println("Opcion invalida\n");
		}while (op!=4);
	}

}
