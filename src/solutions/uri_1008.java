package solutions;

import java.util.Locale;
import java.util.Scanner;

public class uri_1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salary = horas * valorHora;
		
		System.out.println("NUMBER = "+ n);
		System.out.println(String.format("SALARY = U$ %.2f" , salary));

		sc.close();
	}
}
