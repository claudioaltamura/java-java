package de.claudioaltamura.java.streams;

import java.util.stream.Stream;

public class IntStream {

	public Stream<Integer> getStream() {
		return Stream.iterate(1, n -> n + 2).limit(10);
	}
}
