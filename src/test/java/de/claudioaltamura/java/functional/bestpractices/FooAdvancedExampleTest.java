package de.claudioaltamura.java.functional.bestpractices;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

class FooAdvancedExampleTest {

	@Test
	void test() {
		var fooAdvancedExample = new FooAdvancedExample();
		Function<String, String> fn = parameter -> parameter + " from lambda";

		assertThat(fooAdvancedExample.add("Message", fn)).isEqualTo("Message from lambda");
	}

}