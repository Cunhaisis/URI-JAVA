package solutions;
import java.util.Locale;
import java.util.Scanner;

public class uri_1005 {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double MEDIA = ((A * 3.5) +( B * 7.5)) / 11;
		
		System.out.println(String.format("MEDIA = %.5f" , MEDIA));
		//System.out.printf("MEDIA = %.5f%n ", MEDIA);
		
		sc.close();
	}

}
