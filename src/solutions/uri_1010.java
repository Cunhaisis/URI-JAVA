package solutions;

import java.util.Locale;
import java.util.Scanner;

public class uri_1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double v1 = sc.nextDouble();

		int cod2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double v2 = sc.nextDouble();

		double total = (qtd1 * v1) + (qtd2 * v2);

		System.out.printf(String.format("VALOR A PAGAR: R$ %.2f", total));

		sc.close();
	}
}


