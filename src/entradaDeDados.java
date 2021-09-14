import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {

		/*
		 * Leitura de String Scanner sc = new Scanner(System.in); String x; x =
		 * sc.next(); System.err.println("Você digitou o valor de " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * Leitura de INT
		 * 
		 * Scanner sc = new Scanner(System.in); int x; x = sc.nextInt();
		 * System.err.println("Você digitou o valor de " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * Leitura de Double Scanner sc = new Scanner(System.in); Double x; x =
		 * sc.nextDouble(); System.err.println("Você digitou o valor de " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * Scanner sc = new Scanner(System.in); String x; int y; double z;
		 * 
		 * x = sc.next(); y = sc.nextInt(); z = sc.nextDouble();
		 * 
		 * System.err.println("Você digitou o valor de " + x); System.out.println(x);
		 * System.out.println(y); System.out.println(z);
		 * 
		 * 
		 * sc.close();
		 */
		
		
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}
	


}
