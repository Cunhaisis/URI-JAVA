package solutions;

import java.util.Scanner;

public class uri_1018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(n);

		int n100 = n / 100;
		int resto = n - (n100 * 100);

		int n50 = resto / 50;
		resto -= n50 *50;

		int n20 = resto / 20;
		resto -= (n20 * 20);

		int n10 = resto / 10;
		resto -= n10 * 10;

		int n5 = resto / 5;
		resto -= n5 * 5;

		int n2 = resto / 2;
		resto -=n2 * 2;

		int n1 = resto / 1;
		resto -=n1 * 1;

		System.out.println(n100 + " nota(s) de R$ 100,00");
		System.out.println(n50 + " nota(s) de R$ 50,00");
		System.out.println(n20 + " nota(s) de R$ 20,00");
		System.out.println(n10 + " nota(s) de R$ 10,00");
		System.out.println(n5 + " nota(s) de R$ 5,00");
		System.out.println(n2 + " nota(s) de R$ 2,00");
		System.out.println(n1 + " nota(s) de R$ 1,00");

		sc.close();
	}

}
