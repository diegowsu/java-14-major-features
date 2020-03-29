package com.duberton.switchexpression;

public class SwitchExpression {

  public static void main(String[] args) {
    var season = monthToSeason(2);
    var unknownSeason = monthToSeason(13);
    System.out.println("Known season: " + season);
    System.out.println("Unknown season: " + unknownSeason);
  }

  private static String monthToSeason(Integer month) {
    return switch (month) {
      case 3, 4, 5 -> "Spring";
      case 6, 7, 8 -> "Summer";
      case 9, 10, 11 -> "Fall";
      case 12, 1, 2 -> "Winter";
      default -> {
        System.out.println("Month doesn't exist");
        yield "Is that really a month?";
      }
    };
  }
}
