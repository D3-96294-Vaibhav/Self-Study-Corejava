package Question_5;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text : ");
		String input = scanner.nextLine();
		
		TextAnalyzer textAnalyzer = new TextAnalyzer(input);
		textAnalyzer.analyze();
	}

}
