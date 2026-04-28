package Question_2;

public class Circle extends TwoDShape {
	static double PI = 3.14;
	private double radius;

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	@Override
	void shapeType() {
		// TODO Auto-generated method stub
		System.out.println("2D Shape");
	}
	
}
