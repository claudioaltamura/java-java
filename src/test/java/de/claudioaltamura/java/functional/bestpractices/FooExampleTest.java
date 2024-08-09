package de.claudioaltamura.java.functional.bestpractices;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FooExampleTest {

	@Test
	void test() {
		var fooExample = new FooExample();
		Foo foo = parameter -> parameter + "from lambda";

		assertThat(fooExample.add("Message ", foo)).isEqualTo("Message from lambda");
	}

}