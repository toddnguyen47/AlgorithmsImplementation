package com.toddnguyen47.adventofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddUpTo2020 {
  private List<String> _lines = new ArrayList<>();

  public void addUpTo2020(List<String> lines) {
    this._lines = lines;
    List<Integer> listOfInts = this._lines.stream().map((s1) -> Integer.valueOf(s1))
        .collect(Collectors.toList());
    int size = listOfInts.size();
    for (int i = 0; i < size; i++) {
      int num1 = listOfInts.get(i);
      for (int j = i + 1; j < size; j++) {
        int num2 = listOfInts.get(j);
        for (int k = j + 1; k < size; k++) {
          int num3 = listOfInts.get(k);
          if (num1 + num2 + num3 == 2020) {
            System.out.println(num1 * num2 * num3);
          }
        }
      }
    }
  }

  private void sortAndStuff() {
    // Sort the list first
    List<Integer> listOfInts = this._lines.stream().map((s1) -> Integer.valueOf(s1))
        .collect(Collectors.toList());
    listOfInts.sort(null);

    // Have three pointers
    int loPtr = 0;
    int hiPtr = listOfInts.size();
    int medPtr = loPtr + 1;

    while (loPtr < hiPtr) {
    }
  }
}
