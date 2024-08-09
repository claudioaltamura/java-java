package de.claudioaltamura.java.functional.composing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FunctionsTest {

	@Test
	void test() {
		Functions functions = new Functions();

		assertThat(functions.square.compose(functions.triple).applyAsInt(1)).isEqualTo(9);
	}
}