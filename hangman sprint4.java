import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hangman {
	static String[] words, makeup_words,brands_words,fruits_words,vegetables_words;
	static String word;
	static String hash,temp = "";
	static int count = 0;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("It is our pleasure to have you, try your luck guessing the word!");
		words = new String[]{"Manchester", "University", "Students", "Nelson", "Pizza"};
		makeup_words = new String[] {"Lipstick","Eyeliner","Eyeshadow","Concealer","Foundation","Primer","Settingspray","Compact","Kajal","Blush"};
		brands_words = new String[] {"Adidas","Nike","Puma","Underarmour","Crocs","Versace","Sketchers","Holister","Coach","Gap"};
		fruits_words = new String[] {"Apple","Banana","Watermelon","Strawberry","Orange","Kiwi","Pineapple","Grapes","Mango","Raspberry"};
		vegetables_words = new String[] {"Onion","Chillies","Carrot","Beans","Capsicum","Potato","Tomato","Brinjal","Broccoli","Cauliflower"};
		System.out.println("Choose one of the category");
		System.out.println("1. MakeUp\n2. Brands\n3. Fruits\n4. Vegetables");
		String input_word = sc.nextLine();
		if (input_word.equalsIgnoreCase("MakeUp")) {
			word = makeup_words[(int) (Math.random() * makeup_words.length)];
		}
		else if(input_word.equalsIgnoreCase("Brands")) {
			word = brands_words[(int) (Math.random() * brands_words.length)];
		}
		else if (input_word.equalsIgnoreCase("Fruits")) {
			word = fruits_words[(int) (Math.random() * fruits_words.length)];
		}
		else if(input_word.equalsIgnoreCase("Vegetables")) {
			word = vegetables_words[(int) (Math.random() * vegetables_words.length)];
		}
		hash = new String(new char[word.length()]).replace("\0", "#");
		count = 0;


		while (count < 9 && hash.contains("#")) {
			System.out.println("Try your luck guessing the word");
			System.out.println(hash);
			String guess = sc.next();
			if(!temp.contains(guess)){
				temp = temp + guess;
				hang(guess);
			}
			else {
				System.out.println("Used already Try Other");
			}
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
			count++;
			hangmanImage();
			
		} else {
			hash = newhash;
		}
		if (hash.equals(word)) {
			System.out.println("Hoorayy!! You are correct!! Your answer matches with " + word);
		}
	}

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (count == 7) {
			System.out.println("   ___________^");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			
		}
		if (count == 8) {
			System.out.println("   ___________^_");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			
	}
		if (count == 9) {
			System.out.println("GAME OVER!");
			System.out.println("   ___________^_^");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The word was " + word);
}
	}
}
	
