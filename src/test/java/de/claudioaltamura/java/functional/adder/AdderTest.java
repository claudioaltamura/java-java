package de.claudioaltamura.java.functional.adder;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

class AdderTest {

	@Test
	void test() {
		GenericFunction<Long, Long> adder = new Adder();

		assertThat(adder.apply(4L)).isEqualTo(7L);
	}

	@Test
	void simpleLambda() {
		Function<Long, Long> adder = (value) -> value + 3;

		assertThat(adder.apply(4L)).isEqualTo(7L);
	}

}