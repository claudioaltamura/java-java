package de.claudioaltamura.java.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericMethodExample {

	private GenericMethodExample(){}

	static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
		return Arrays.stream(a)
				.map(mapperFunction)
				.collect(Collectors.toList());
	}
}
