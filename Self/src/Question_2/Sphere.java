package Question_2;

public class Sphere extends ThreeDShape  {
	static double PI = 3.14;
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	void shapeType() {
		// TODO Auto-generated method stub
		System.out.println("3-D Shape");	
	}
	

	@Override
	public double calculateVolume() {
		return ((4/3) * PI * radius * radius * radius) ;
	}
 
}
