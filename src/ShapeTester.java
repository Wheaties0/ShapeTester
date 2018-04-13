import java.util.*;

public class ShapeTester {
	public static void main (String [] args) {
		
		//Box Method
		Box box = new Box();
		box.Volume();
		box.SurfaceArea();

		//Sphere Method
		Sphere sphere = new Sphere();
		sphere.Volume();
		sphere.SurfaceArea();
		
		//Pyramid Method
		Pyramid pyramid = new Pyramid();
		pyramid.Volume();
		// pyramid.SurfaceArea();
	}
}
