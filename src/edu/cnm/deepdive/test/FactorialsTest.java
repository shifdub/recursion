package edu.cnm.deepdive.test;

import statuc org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Test;



class FactorialsTest {

  static final int[] input = {

      0 1 (none)
      1 1 (none)
      5 120 (none)
      10 3628800 (none)
      13 6227020800L (none)
  };

  static final long[] expectedValues = {
      1,
      1,
      120,
      368800,
      622702800L
  };

  @Test
  void computerRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      int input = inputValues[i];
      long expected = expectedValues[i];
      long actual = Factorials.computeRecursive(input);
      assertEquals(expected, actual);

    }
  }

  @Test
  void computeRecursive_exception() {
    asserThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1);

  }
}


