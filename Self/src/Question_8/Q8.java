package Question_8;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 = 5*4*3*2*1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("The factorial :" + 1);			
			return;
		}
		long factorial = IntStream.rangeClosed(1, n).reduce(1, (a,b) -> a*b);
		System.out.println("The factorial :" + factorial);
	}

}
