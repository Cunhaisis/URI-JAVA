package solutions;
import java.util.Scanner;

public class uri_1007 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int DIF = (A * B) - (C * D);
		
		System.out.println("DIFERENCA = " + DIF);
		
		sc.close();
	}

}
