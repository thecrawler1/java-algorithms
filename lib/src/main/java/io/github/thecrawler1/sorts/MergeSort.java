package io.github.thecrawler1.sorts;

import java.util.Arrays;

public class MergeSort {
  public static int[] sort(int[] arr) {
    if (arr.length <= 1) {
      return arr;
    }

    int mid = arr.length / 2;
    var firstHalf = Arrays.copyOfRange(arr, 0, mid);
    var secondHalf = Arrays.copyOfRange(arr, mid, arr.length);

    var i = 0;
    var j = 0;
    var index = 0;

    int[] ordered = new int[arr.length];

    while (i < firstHalf.length && j < secondHalf.length) {
      if (firstHalf[i] <= secondHalf[j])
        ordered[index++] = firstHalf[i++];
      else
        ordered[index++] = secondHalf[j++];
    }

    while (i < firstHalf.length)
      ordered[index++] = firstHalf[i++];

    while (j < secondHalf.length)
      ordered[index++] = secondHalf[j++];

    return ordered;
  }
}
