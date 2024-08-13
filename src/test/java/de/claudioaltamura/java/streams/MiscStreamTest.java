package de.claudioaltamura.java.streams;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MiscStreamTest {

	@Test
	void shouldReturnFirstElement() {
		assertEquals(Stream.of("a1", "a2", "a3")
				.findFirst().orElseThrow(), "a1");
	}

	@Test
	void shouldCalculateAverage() {
		assertEquals(Arrays.stream(new int[] {1, 2, 3})
				.map(n -> 2 * n + 1)
				.average().orElseThrow(),5.0D);
	}

	@Test
	void shouldFilter() {
		Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> {
					System.out.println("filter: " + s);
					return true;
				})
				.forEach(s -> System.out.println("forEach: " + s));
	}

	@Test
	void shouldMapAndAnyMatch() {
		assertTrue(Stream.of("d2", "a2", "b1", "b3", "c")
				.map(String::toUpperCase)
				.anyMatch(s -> s.startsWith("A")));
	}

	@Test
	void shouldSortAndFilter() {
		assertEquals(Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> s.startsWith("b"))
				.sorted(String::compareTo)
				.map(String::toUpperCase)
				.toList(), List.of("B1", "B2"));
	}
}