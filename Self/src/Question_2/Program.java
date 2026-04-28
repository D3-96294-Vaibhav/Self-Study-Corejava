package Question_2;

public class Program {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setBreadth(2.0);
		rectangle.setLength(2.0);
		System.out.println(rectangle.calculateArea());
		rectangle.shapeType();
		
		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println(circle.calculateArea());
		circle.shapeType();
		
		Sphere sphere = new Sphere();
		sphere.setRadius(2.0);
		System.out.println(sphere.calculateVolume());
		sphere.shapeType();
		
		Cube cube = new Cube();
		cube.setSide(2.0);
		System.out.println(cube.calculateVolume());
		cube.shapeType();
	}
}
