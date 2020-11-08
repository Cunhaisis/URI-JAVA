package solutions;

import java.util.Locale;
import java.util.Scanner;

public class uri_1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horas = sc.nextInt();
		int velocidade = sc.nextInt();
		
		double distancia = horas * velocidade;
		
		double litros = distancia / 12;
		
		System.out.println(String.format("%.3f" , litros));
		
		sc.close();

	}

}
