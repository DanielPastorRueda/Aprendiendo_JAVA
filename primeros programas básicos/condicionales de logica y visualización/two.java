import java.util.Scanner;


public class two {

	public static void main(String[] args) {
		
		Scanner write = new Scanner(System.in);
		int six;
		
		System.out.println("dame un numero: ");
		six=write.nextInt();
		
		if (six>0)
			System.out.println("es positivo");
		
		if (six==0)
			System.out.println("es cero");
		if (six<0)
			System.out.println("negativo");
	}
}
