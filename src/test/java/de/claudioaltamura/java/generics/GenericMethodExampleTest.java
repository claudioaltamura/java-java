package de.claudioaltamura.java.generics;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;

import java.util.List;

import org.junit.jupiter.api.Test;

class GenericMethodExampleTest {

	@Test
	void givenArrayOfIntegers_thanListOfStringReturnedOK() {
		Integer[] intArray = {1, 2, 3, 4, 5};
		List<String> stringList
				= GenericMethodExample.fromArrayToList(intArray, Object::toString);

		assertThat(stringList, hasItems("1", "2", "3", "4", "5"));
	}

}