package de.claudioaltamura.java.functional.principlesprinciples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.claudioaltamura.java.functional.principles.Factory;
import de.claudioaltamura.java.functional.principles.HigherOrderFunction;

class HigherOrderFunctionTest {

	@Test
	 void test() {
		HigherOrderFunction higherOrderFunction = new HigherOrderFunction();
		Factory<String> factory = higherOrderFunction.createFactory(() -> "Hello", String::toLowerCase);

		assertEquals("hello", factory.create());
	}
}
