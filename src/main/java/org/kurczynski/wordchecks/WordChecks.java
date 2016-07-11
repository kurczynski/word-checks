package org.kurczynski.wordchecks;

public class WordChecks {
	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		Anagram anagram = new Anagram();

		anagram.isAnagram("asdf", "asdf");

		do {
			userInterface.promptAnagram();

		} while (userInterface.continuePrompt());
	}
}
