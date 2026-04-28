package Question_9;

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements in array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("The sum of integer is" + Arrays.stream(arr).sum());
	}
}
