package com.duberton.record;

import java.util.List;

public class BandUsage {

  public static void main(String[] args) {
    var members = List.of(new Member("Jacob"), new Member("Kurt"), new Member("Ben"), new Member("Nate"));
    var converge = new Band("Converge", members);
    var name = converge.name();
    System.out.println(name);
    converge.members().forEach(System.out::println);
  }

}
