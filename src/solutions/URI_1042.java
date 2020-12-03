package uri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1042 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<Integer>();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		numeros.add(a);
		numeros.add(b);
		numeros.add(c);

		Collections.sort(numeros); // Ordena em ordem crescente
		System.out.println(numeros); 
		System.out.println("");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
