package com.duberton.npe;

import com.duberton.record.Band;
import com.duberton.record.Member;
import java.util.List;

public class NullPointerLoggingEnhancement {

  public static void main(String[] args) {
    var converge = new Band("Converge", List.of(new Member("Jacob"), new Member(null)));
    converge.members().forEach(member -> System.out.println(member.name().chars().count()));
  }
}