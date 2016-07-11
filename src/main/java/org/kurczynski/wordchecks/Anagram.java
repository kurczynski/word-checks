package org.kurczynski.wordchecks;

class Anagram {
	/**
	 * Checks to see if the two given strings are anagrams of each other. Only
	 * letters are check (i.e. a-z) and is not case sensitive. Any other
	 * characters that are present in the strings will be ignored. For example,
	 * the strings "l.ove" and "Love" will return true.
	 *
	 * @param stringA String to check if is an anagram.
	 * @param stringB String to check if is an anagram.
	 * @return Returns true if the two given strings are anagrams. Otherwise,
	 * false.
	 */
	boolean isAnagram(String stringA, String stringB) {
		stringA = this.cleanString(stringA);
		StringBuilder stringBuilderB = new StringBuilder(this.cleanString(stringB));

		if (stringA.length() != stringBuilderB.length()) {
			return false;
		}

		for (char a : stringA.toCharArray()) {
			for (char b : stringB.toCharArray()) {
				if (a == b) {
					int index = stringBuilderB.lastIndexOf(String.valueOf(b));
					stringBuilderB.deleteCharAt(index);
				}
			}
		}

		return (stringBuilderB.length() == 0);
	}

	/**
	 * Checks to see if the given character is an alphabetical character. The
	 * character can be uppercase or lowercase.
	 *
	 * @param checkChar The character to be checked.
	 * @return True if the character is alphabetical. Otherwise, false.
	 */
	private boolean isAlpha(char checkChar) {
		return (
				(checkChar >= 65 && checkChar <= 90) ||
						(checkChar >= 97 && checkChar <= 122));
	}

	/**
	 * Removes any characters from a given string that are not alphabetical.
	 * Also makes all characters lowercase for easier comparison.
	 *
	 * @param string The string to be cleaned.
	 * @return The cleaned string.
	 */
	private String cleanString(String string) {
		StringBuilder cleanString = new StringBuilder();

		for (int i = 0; i < string.length(); ++i) {
			if (this.isAlpha(string.charAt(i))) {
				cleanString.append(Character.toLowerCase(string.charAt(i)));
			}
		}

		return cleanString.toString();
	}
}
