package de.claudioaltamura.java.streams;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MyIntStreamTest {

	@Test
	void test() {
		final MyIntStream intStream = new MyIntStream();

		assertThat(intStream.getStream().count()).isEqualTo(10);
	}
}