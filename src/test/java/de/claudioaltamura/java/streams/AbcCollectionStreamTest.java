package de.claudioaltamura.java.streams;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class AbcCollectionStreamTest {

	@Test
	void test() {
		final AbcCollection abc = new AbcCollection();
		Stream<String> stream = abc.getCollection().stream();
		assertThat(stream.count()).isEqualTo(3);
	}

}