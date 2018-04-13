import java.util.Scanner;
import java.lang.Math.*;

public class Sphere {
	double Radius;

	 public void Volume() {
	 	System.out.println("Volume Calculator for Sphere");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Radius Value");
		double Radius = keyboard.nextDouble();

		double Volume = (4 * Math.PI * Radius * Radius * Radius) / 3;

		System.out.println("The Volume of your Sphere is " + Volume);
	}

	public void SurfaceArea() {
		System.out.println("Surface Area Calculator for Sphere");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Radius Value");
		double Radius = keyboard.nextDouble();

		double SurfaceArea = 4 * Math.PI * Radius * Radius;

		System.out.println("The Surface Area of your Sphere is " + SurfaceArea);
	}
}
