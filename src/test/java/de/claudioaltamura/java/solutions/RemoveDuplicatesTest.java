package de.claudioaltamura.java.solutions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

  @Test
  void testRemove() {
    final var actual = RemoveDuplicates.remove(List.of("A", "B", "C", "D"), List.of("A", "B"));

    assertThat(actual).contains("C", "D");
  }

}