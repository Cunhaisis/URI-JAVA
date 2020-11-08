package solutions;

import java.util.Scanner;

public class uri_1019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		// Horas
		int horas = x / 3600;
		int resto = x % 3600;

		// Minutos
		int minutos = resto / 60;
		resto = resto % 60;

		// Segundos

		int segundos = resto / 1;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();

	}

}
