package solutions;

import java.util.Locale;
import java.util.Scanner;

public class uri_1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = sc.next();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();

		double total = (vendas * 15) / 100 + salario;

		System.out.printf(String.format("TOTAL = R$ %.2f", total));

		sc.close();
	}
}
