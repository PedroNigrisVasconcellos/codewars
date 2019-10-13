package com.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicateEncoderTest {

  @Test
  public void simpleTest() {
    final String response = DuplicateEncoder.encode("APPLE");

    Assertions.assertEquals("())((", response);
  }
}
