import java.util.Scanner;

public class Hangman {

	private static String[] words = {"Manchester", "University", "Students", "Nelson", "Pizza"};
	private static String word = words[(int) (Math.random() * words.length)];
	private static String hash = new String(new char[word.length()]).replace("\0", "#");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("It is our pleasure to have you, try your luck guessing the word!");

		while (hash.contains("#")) {
			System.out.println(hash);
			String guess = sc.next();
			hang(guess);
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newhash = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newhash += guess.charAt(0);
			} else if (hash.charAt(i) != '#') {
				newhash += word.charAt(i);
			} else {
				newhash += "#";
			}
		}

		if (hash.equals(newhash)) {
			
		} else {
			hash = newhash;
		}
		if (hash.equals(word)) {
			System.out.println("Hoorayy!! You are correct!! Your answer matches with " + word);
		}
	}
}