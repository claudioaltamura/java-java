package de.claudioaltamura.java.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionTest {

	@Test
	void testContainsAll() {
		Collection<String> pasta = List.of("Spaghetti", "Linguine");

		assertTrue(pasta.containsAll(List.of("Spaghetti", "Linguine")));
	}

	@Test
	void testRetainAll() {
		Collection<String> pasta = new ArrayList();
		pasta.add("Spaghetti");
		pasta.add("Linguine");
		pasta.add("Farfalle");

		assertTrue(pasta.retainAll(List.of("Linguine")));
		assertEquals(List.of("Linguine"), pasta);
	}

}
