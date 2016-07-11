package org.kurczynski.wordchecks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserInterface {
	private final static String YES = "y";
	private final static String NO = "n";

	private Scanner reader;
	private Anagram anagram;

	UserInterface() {
		this.reader = new Scanner(System.in);
		this.anagram = new Anagram();
	}

	private ArrayList<String> promptWords() {
		ArrayList<String> words = new ArrayList<String>();

		System.out.println("Please enter the first word");
		words.add(this.reader.nextLine());

		System.out.println("Please enter the second word");
		words.add(this.reader.nextLine());

		return words;
	}

	void promptAnagram() {
		List<String> words = this.promptWords();

		String wordOne = words.get(0);
		String wordTwo = words.get(1);

		if (anagram.isAnagram(wordOne, wordTwo)) {
			System.out.println("\"" + wordOne + "\" is an anagram of \"" + wordTwo + "\"");
		} else {
			System.out.println("\"" + wordOne + "\" is not an anagram of \"" + wordTwo + "\"");
		}
	}

	boolean continuePrompt() {
		String option;

		while (true) {
			System.out.println("Continue? (" + UserInterface.YES + "/" + UserInterface.NO + ")");
			option = this.reader.nextLine();
			option = option.toLowerCase();

			if (option.equals(UserInterface.YES)) {
				return true;
			} else if (option.equals(UserInterface.NO)) {
				return false;
			}
		}
	}
}
