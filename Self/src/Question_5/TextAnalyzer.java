package Question_5;

public class TextAnalyzer {
	private String text;

	public TextAnalyzer(String text) {
		this.text = text;
	}
	
	
	public void analyze() {
		
		long vowels = text.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
		long consonants = text.toLowerCase().chars().filter(c -> Character.isLetter(c) && "aeiou".indexOf(c) == -1).count();
		long digits = text.toLowerCase().chars().filter(c -> Character.isDigit(c)).count();
		long specialChars = text.toLowerCase().chars().filter(c -> !Character.isLetterOrDigit(c) && !Character.isWhitespace(c)).count();
		
		long totalChars = text.length();
		
		//stats
		System.out.println("Vowels :" + vowels);
		System.out.println("Consonants :" + consonants);
		System.out.println("Digits :" + digits);
		System.out.println("Special Chars : " + specialChars);
		System.out.println("Total Chars : " + totalChars);
		
	}
	
	
	
}
	