package de.claudioaltamura.java.solutions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class DifferencesInListTest {

  @Test
  void testWithList() {
    final List<Integer> differences = DifferencesInList.differences(List.of(1, 2, 3, 4), List.of(1, 3));

    assertThat(differences).contains(2,4);
  }

  @Test
  void testWithStreams() {
    final List<String> differences = DifferencesInList.differencesWithStream(List.of("Peter", "Bruce", "Clark"), List.of("Peter", "Clark"));

    assertThat(differences).contains("Bruce");
  }

}