package org.kurczynski.wordchecks;

public class WordChecks {
	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();

		do {
			userInterface.promptAnagram();
		} while (userInterface.continuePrompt());

		System.out.println("Exiting...");
	}
}
