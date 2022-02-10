package io.github.thecrawler1.sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
  @Test void emptyTest() {
    int[] expect = {};
    int[] arr = {};
    int[] actual = MergeSort.sort(arr);

    assertArrayEquals(expect, actual);
  }

  @Test void singleElementTest() {
    int[] expect = {1};
    int[] arr = {1};
    int[] actual = MergeSort.sort(arr);

    assertArrayEquals(expect, actual);
  }

  @Test void orderedTwoElementsTest() {
    int[] expect = {1, 2};
    int[] arr = {1, 2};
    int[] actual = MergeSort.sort(arr);

    assertArrayEquals(expect, actual);
  }

  @Test void unorderedTwoElementsTest() {
    int[] expect = {1, 2};
    int[] arr = {2, 1};
    int[] actual = MergeSort.sort(arr);

    assertArrayEquals(expect, actual);
  }

  @Test void orderedThreeElementsTest() {
    int[] expect = {-4, 0, 9};
    int[] arr = {-4, 0, 9};
    int[] actual = MergeSort.sort(arr);

    assertArrayEquals(expect, actual);
  }

  @Test void unorderedThreeElementsTest() {
    int[] expect = {-4, 0, 9};
    int[] arr = {9, -4, 0};
    int[] actual = MergeSort.sort(arr);

    assertArrayEquals(expect, actual);
  }
}
