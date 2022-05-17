package de.claudioaltamura.java.streams;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class IntStreamTest {

	@Test
	void test() {
		final IntStream intStream = new IntStream();

		assertThat(intStream.getStream().count()).isEqualTo(10);
	}
}