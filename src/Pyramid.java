import java.util.Scanner;
import java.lang.Math.*;
import static java.lang.Math.sqrt;

public class Pyramid {
	float Height;
	float Breadth;
	float Length;

	 public void Volume() {
	 	System.out.println("Volume Calculator for Pyramid");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Length Value");
		float Length = keyboard.nextFloat();
		System.out.println("Enter Height Value");
		float Height = keyboard.nextFloat();
		System.out.println("Enter Breadth Value");
		float Breadth = keyboard.nextFloat();

		float Volume = (Length * Height * Breadth) / 3;

		System.out.println("The Volume of your Pyramid is " + Volume);
	}
}
