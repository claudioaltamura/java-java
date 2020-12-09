package de.claudioaltamura.java.collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListTest {

	@Test
	void test() {
		List<String> pasta = List.of("Spaghetti", "Linguine", "Farfalle");

		assertEquals(3, pasta.size());
	}

	@Test
	void shuffle() {
		List<String> pasta = Arrays.asList("Spaghetti", "Linguine", "Farfalle");

		Collections.shuffle(pasta);

		System.out.println(pasta);
	}

	@Test
	void reverse() {
		List<String> pasta = Arrays.asList("Spaghetti", "Linguine", "Farfalle");

		Collections.reverse(pasta);

		assertEquals(Arrays.asList("Farfalle", "Linguine", "Spaghetti"), pasta);
	}


}
