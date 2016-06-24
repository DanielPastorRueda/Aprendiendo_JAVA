import java.util.Scanner;


public class one {

	private String dato1;
	private String dato2;
	
	public String getDato1() {
		return dato1;
	}
	public void setDato1(String dato1) {
		this.dato1 = dato1;
	}
	public String getDato2() {
		return dato2;
	}
	public void setDato2(String dato2) {
		this.dato2 = dato2;
	}
	
	public static void main(String[] args) {
		
		one one1, one2; 
		one1= new one();
		one2= new one();
		
		Scanner write = new Scanner(System.in);
		
		System.out.println("Escribe el dato 1");
		one1.setDato1(write.next());
		
		System.out.println("Escribe el dato 2");
		one2.setDato1(write.next());
		
		System.out.println("valor de dato1 es "+one1.getDato1());
		System.out.println("valor de dato1 es "+one2.getDato1());
		
		one1.dato1=one1.dato2;
		one2.dato1=one2.dato2;
		
		one1.setDato1(one2.getDato2());
		one2.setDato1(one1.getDato2());
		
		
		
	}
	
	
	
}
