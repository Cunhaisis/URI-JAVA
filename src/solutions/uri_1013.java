package solutions;

import java.util.Locale;
import java.util.Scanner;

public class uri_1013 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int maior = 0;
		
		if(A > B && A > C) {
			maior = A;
		}
		
		if(B > A && B > C) {
			maior = B;
		}
		if(C> A && C > B) {
			maior = C;
		}
		
		System.out.println(maior + " eh o maior");
		
		sc.close();
	}
}

