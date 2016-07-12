package org.kurczynski.wordchecks;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
	@Test
	public void isAnagram() throws Exception {
		Anagram anagram = new Anagram();

		boolean isAnagram = anagram.isAnagram("boom", "boom");
		assertTrue(isAnagram);

		isAnagram = anagram.isAnagram("love", "l.ove");
		assertTrue(isAnagram);

		isAnagram = anagram.isAnagram("asdf", "qwer");
		assertFalse(isAnagram);

		isAnagram = anagram.isAnagram("GREAT WHITE BUFFALO", "great white buffalo");
		assertTrue(isAnagram);

		isAnagram = anagram.isAnagram("here is a * string 23 FOR", "here %) is a s!TRING for");
		assertTrue(isAnagram);

		isAnagram = anagram.isAnagram("side", "beside");
		assertFalse(isAnagram);

		isAnagram = anagram.isAnagram("outside", "out");
		assertFalse(isAnagram);
	}
}