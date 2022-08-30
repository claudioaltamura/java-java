package de.claudioaltamura.java.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class DifferencesInList {

  private DifferencesInList() {}
  static <T> List<T> differences(List<T> listOne, List<T> listTwo) {
    final ArrayList<T> result = new ArrayList<>(listOne);
    result.removeAll(listTwo);
    return result;
  }

  static <T> List<T> differencesWithStream(List<T> listOne, List<T> listTwo) {
    return  listOne.stream()
        .filter(element -> !listTwo.contains(element))
        .collect(Collectors.toList());
  }

}
