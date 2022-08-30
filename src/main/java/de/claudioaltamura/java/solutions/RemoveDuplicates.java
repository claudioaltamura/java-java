package de.claudioaltamura.java.solutions;

import java.util.ArrayList;
import java.util.List;

class RemoveDuplicates {

  private RemoveDuplicates() {}

  static <T> List<T> remove(List<T> listOne, List<T> listTwo) {
    final ArrayList<T> result = new ArrayList<>(listOne);
    listTwo.forEach(result::remove);

    return result;
  }
}
