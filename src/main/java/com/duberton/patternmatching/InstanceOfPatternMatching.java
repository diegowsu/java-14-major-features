package com.duberton.patternmatching;

public class InstanceOfPatternMatching {

  public static void main(String[] args) {
    var number = Integer.MAX_VALUE;
    revealANumbersInstance(number);
    evaluatesToTrue(number);
  }

  private static void revealANumbersInstance(Number number) {
    if (number instanceof Integer smaller) {
      System.out.println("I store 32 bits of data: " + smaller);
    }
    if (number instanceof Long bigger) {
      System.out.println("I store 64 bits of data: " + bigger);
    }
  }

  private static void evaluatesToTrue(Number number) {
    if (!(number instanceof Integer integer)) {
      System.out.println("Variable 'integer' wasn't bound to this scope");
    } else {
      System.out.println("Variable 'integer' is available in here: " + integer);
    }
  }
}
