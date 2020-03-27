package com.duberton.text;

public class TextBlocks {

  public static void main(String[] args) {
    String before = before();
    String after = after();
    System.out.println(before);
    System.out.println(after);
  }

  private static String before() {
    return "Such a long text"
        + "that contains a bunch of information about anything"
        + "that you might be interested in."
        + "Who knows, it might be either something good"
        + "or something that's not so good, but, at the end of the day, it's still something,"
        + "right?";
  }

  private static String after() {
    return """
        Such a long text
        that contains a bunch of information about anything
        that you might be interested in.
        Who knows, it might be either something good
        or something that's not so good, but, 
        at the end of the day, it's still something,
        right?""";
  }

  private static String trailingWhiteSpacesStripped() {
    return """
        Such a long text         
        that contains a bunch of information about anything             
        that you might be interested in.
        Who knows, it might be either something good
        or something that's not so good, but, 
        at the end of the day, it's still something,
        right?
        """;
  }

  private static String trailingWhiteSpacesNotStripped() {
    return """
        Such a long text         \s
        that contains a bunch of information about anything                     \s             
        that you might be interested in.
        Who knows, it might be either something good
        or something that's not so good, but, 
        at the end of the day, it's still something,
        right?
        """;
  }

}
