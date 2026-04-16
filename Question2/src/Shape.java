import java.util.*;


class Shapes{
	
		public void calculateArea() {};
		public void calculateVolume() {};
	
}

class Shapes2d extends Shapes{
	
}

class Shapes3d extends Shapes{
	public void calculateVolume() {};
}

class Circle extends Shapes2d{
	double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public void calculateArea() {
		double area=3.14*radius*radius;
		System.out.println("Area of Cicle: " + area);
	}
}

class Rectangle extends Shapes2d{
	double length;
	double width;
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	public void calculateArea() {
		double area=length*width;
		System.out.println("Area of Rectangle: " + area);
	}
}


class Sphere extends Shapes3d{
	double radius;
	
	public Sphere(double radius) {
		this.radius=radius;
	}
	
	public void calculateArea(){
		double area = 4*3.14*radius*radius;
		System.out.println("Area of sphere : "+ area);
		
	}
	
	public void calculateVolume() {
		double vol=4/3*(3.14*(radius*radius*radius));
		System.out.println("Volume of sphere: "+ vol);
	}
}



class Cube extends Shapes3d{
	double side;
	
	public Cube(double side) {
		this.side=side;
	}
	
	public void calculateArea(){
		double area = 6*side*side;
		System.out.println("Area of Cube : "+ area);
		
	}
	
	public void calculateVolume() {
		double vol=side*side*side;
		System.out.println("Volume of Cube: "+ vol);
	}
}



public class Shape {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the radius for circle");
	  double rc=sc.nextDouble();
	  Circle c=new Circle(rc);

	  
	  System.out.println("Enter the length and width for rectangle");
	  double l=sc.nextDouble();
	  double w=sc.nextDouble();
	  Rectangle r=new Rectangle(l,w);

	  
	  System.out.println("Enter the radius for Sphere");
	  double rs=sc.nextDouble();
	  Sphere s=new Sphere(rs);
	  
	  System.out.println("Enter the side for Cube");
	  double side=sc.nextDouble();
	  Cube cu=new Cube(side);
	  
	  
	  
	  
	  c.calculateArea();
	  r.calculateArea();
	  s.calculateArea();
	  s.calculateVolume();
	  cu.calculateArea();
	  cu.calculateVolume();
	  
	}

}
