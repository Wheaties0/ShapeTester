import java.util.Scanner;

public class Box {
	float Height;
	float Breadth;
	float Length;

	 public void Volume() {
	 	System.out.println("Volume Calculator for Box");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Length Value");
		float Length = keyboard.nextFloat();
		System.out.println("Enter Height Value");
		float Height = keyboard.nextFloat();
		System.out.println("Enter Breadth Value");
		float Breadth = keyboard.nextFloat();

		float Volume = Length * Height * Breadth;

		System.out.println("The Volume of your Box is " + Volume);
	}

	public void SurfaceArea() {
		System.out.println("Surface Area Calculator for Box");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Length Value");
		float Length = keyboard.nextFloat();
		System.out.println("Enter Height Value");
		float Height = keyboard.nextFloat();
		System.out.println("Enter Breadth Value");
		float Breadth = keyboard.nextFloat();

		float SurfaceArea = (2 * Length * Breadth) + (2 * Length * Height) + (2 * Height * Breadth);

		System.out.println("The Surface Area of your Box is " + SurfaceArea);
	}
}

