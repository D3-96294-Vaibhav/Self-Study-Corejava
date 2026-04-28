package Question_2;

public class Rectangle extends TwoDShape {
	
	private double length;
	private double breadth;
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length * breadth;
	}
	
	@Override
	void shapeType() {
		// TODO Auto-generated method stub
		System.out.println("2D Shape");
	}

}
