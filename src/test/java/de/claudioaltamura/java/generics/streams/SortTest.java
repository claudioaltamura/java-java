package de.claudioaltamura.java.generics.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void shouldSortListNatural() {
		//using Streams for creating a mutable list
		List<Integer> integers = Stream.of(4,2,8,3,5,13).collect(Collectors.toList());

		Collections.sort(integers);

		assertEquals(integers, List.of(2, 3, 4, 5, 8, 13));
	}

	@Test
	void shouldSortListReverse() {
		//using Streams for creating a mutable list
		List<Integer> integers = Stream.of(4,2,8,3,5,13).collect(Collectors.toList());

		integers.sort(Comparator.reverseOrder());

		assertEquals(integers, List.of(13, 8, 5, 4, 3, 2));
	}

	@Test
	void shouldSortMapByKeys(){
		Map<Integer, String> map = new HashMap<>();
		map.put(55, "John");
		map.put(22, "Peter");
		map.put(12, "George");

		List<Map.Entry<Integer, String>> entries
				= new ArrayList<>(map.entrySet());
		entries.sort((o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		assertArrayEquals(new Integer[]{ 12, 22, 55 }, sortedMap.keySet().toArray());
	}

}