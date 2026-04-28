package Question_13;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Comparator;

class Student {
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public String getCity() {
		return city;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return roll + "-" + name + "-" + city + "-" + marks;
	}
	
}

class CustomComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int diff = o2.getCity().compareTo(o1.getCity());
		if(diff == 0) {
			diff = (int)(o2.getMarks() - o1.getMarks());
		}
		if(diff == 0) {
			diff = o1.getName().compareTo(o2.getName());
		}
		return diff;
	}
	
}

public class Q6 {
	
	public static void main(String[] args) {
		Student[] students = {
				new Student(5, "raj", "pune", 80.5),
				new Student(2, "preetam", "delhi", 80.5),
				new Student(3, "Prakhar", "pune", 90.5),
				new Student(1, "Shurya", "delhi", 95.3),
				new Student(4, "Adtiya", "pune", 90.5),
				};
		
		Arrays.sort(students, new CustomComparator());
		
		for(Student st: students) {
			System.out.println(st);
		}

	}
}
