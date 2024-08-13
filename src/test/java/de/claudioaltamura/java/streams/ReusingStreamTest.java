package de.claudioaltamura.java.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReusingStreamTest {

	@Test
	void shouldReuseStream() {
		Supplier<Stream<String>> streamSupplier = () -> Stream.of("a1", "a3", "c3");

		assertTrue(streamSupplier.get().anyMatch(s->s.startsWith("a")));
		assertTrue(streamSupplier.get().noneMatch(s->s.contains("4")));
	}

}