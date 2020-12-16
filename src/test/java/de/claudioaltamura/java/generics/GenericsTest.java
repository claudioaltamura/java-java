package de.claudioaltamura.java.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericsTest {

	@Test
	void testGenericType() {
		GenericType<Integer> genericType = new GenericType<>();
		genericType.set(1);

		assertEquals(1, genericType.get());
	}

	@Test
	void testGenericInterface() {
		Countable<String> countable = String::length;

		assertEquals(5, countable.count("hello"));
	}

}
