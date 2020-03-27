package com.duberton.record;

import java.util.List;

public class BandUsage {

  public static void main(String[] args) {
    var recordBandEntity = new Band("Converge", List.of("Jacob", "Kurt", "Ben", "Nate"));
    var name = recordBandEntity.name();
    System.out.println(name);
    recordBandEntity.members().forEach(System.out::println);
  }

}
