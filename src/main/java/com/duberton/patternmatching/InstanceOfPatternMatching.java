package com.duberton.patternmatching;

public class InstanceOfPatternMatching {

  public static void main(String[] args) {
    var number = Integer.MAX_VALUE;
    revealANumbersInstance(number);
  }

  private static void revealANumbersInstance(Number number) {
    if (number instanceof Integer smaller) {
      System.out.println("I store 32 bits of data: " + smaller);
    }
    if (number instanceof Long bigger) {
      System.out.println("I store 64 bits of data: " + bigger);
    }
  }
}
