package de.claudioaltamura.java.solutions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
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

  @Test
  void testDisjoint() {
    final var list1 = new ArrayList<>();
    list1.add("A");
    list1.add("B");

    final var list2 = new ArrayList<>();
    list2.add("A");
    list2.add("B");
    list2.add("c");

    assertThat(Collections.disjoint(list1, list2)).isFalse();



  }

}