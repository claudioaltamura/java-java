package de.claudioaltamura.java.collections;

import de.claudioaltamura.java.Person;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitIteratorTest {

	@Test
	void testTryAdvanced() {
		Collection<Person> persons = List.of(Person.of("Peter"), Person.of("Angelo"));

		int count = 0;
		Spliterator<Person> spliterator = persons.spliterator();
		Consumer<Person> consumer = p -> p.setName(p.getName().concat(" Roberts"));
		while(spliterator.tryAdvance(consumer)) {
			count++;
		}

		assertEquals(2, count);

	}

}
