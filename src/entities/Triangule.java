package entities;

public class Triangule {
	
	private double a;
	private double b;
	private double c;	
	
	public Triangule(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		double p = (this.a + this.b + this.c) / 2;
		return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}	

	public static void largerArea(double areaX, double areaY) {
		if (areaX > areaY) System.out.println("Larger area: X");
		else if (areaX < areaY) System.out.println("Larger area: Y");
		else System.out.println("The areas are equal!");
	}
	
}
