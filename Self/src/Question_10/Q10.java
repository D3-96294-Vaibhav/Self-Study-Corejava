package Question_10;

import java.util.stream.IntStream;

public class Q10 {
	public static void main(String[] args) {
		
		IntStream stream = IntStream.rangeClosed(1, 10);
		
		int sum = stream.sum();
		
		System.out.println("The sum is: " + sum);
		
		System.out.println("The stats is: " + IntStream.of(1,2,3,4,5,6,7,8,9,10).summaryStatistics().toString());
	}
}
