package de.claudioaltamura.java.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HigherOrderFunctionTest {

	@Test
	 void test() {
		HigherOrderFunction higherOrderFunction = new HigherOrderFunction();
		Factory<String> factory = higherOrderFunction.createFactory(() -> "Hello", String::toLowerCase);

		assertEquals("hello", factory.create());
	}
}
