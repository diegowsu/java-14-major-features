package com.duberton.npe;

public class NullPointerLoggingEnhancement {

  public static void main(String[] args) {
    String iAmNullAndIWantToGenerateTurmoil = null;
    Long value = iAmNullAndIWantToGenerateTurmoil.chars().count();
    System.out.println(value);
  }
}
