package de.claudioaltamura.java.solutions;

import java.util.ArrayList;
import java.util.List;

public class DifferencesInList {

  private DifferencesInList() {}
  public static <T> List<T> differences(List<T> listOne, List<T> listTwo) {
    final ArrayList<T> result = new ArrayList<>(listOne);
    result.removeAll(listTwo);
    return result;
  }

}
