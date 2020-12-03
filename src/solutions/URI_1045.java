package uri;

import java.util.Locale;
import java.util.Scanner;

public class URI_1045 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double aux;

		if (b > a && b > c) {
			aux = a;
			a = b;
			b = aux;
		} else if (c > a) {
			aux = a;
			a = c;
			c = aux;
		}

		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (a * a == (b * b) + (c * c))
				System.out.println("TRIANGULO RETANGULO");
			if (a * a > (b * b) + (c * c))
				System.out.println("TRIANGULO OBTUSANGULO");
			if (a * a < (b * b) + (c * c))
				System.out.println("TRIANGULO ACUTANGULO");
			if (a == b && a == c)
				System.out.println("TRIANGULO EQUILATERO");
			if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a))
				System.out.println("TRIANGULO ISOSCELES");

		}
	}

}

