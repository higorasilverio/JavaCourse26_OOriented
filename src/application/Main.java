package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		Triangule x = new Triangule(a, b, c);
		System.out.println("Enter the measures of triangle Y: ");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		Triangule y = new Triangule(a, b, c);
		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());
		Triangule.largerArea(x.area(), y.area());
				
		scanner.close();		
	}

}
