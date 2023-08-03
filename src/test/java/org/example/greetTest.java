package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class greetTest {
    @Test
    public void Test() {
        assertEquals("should greet some people normally", "Hello, Jim!", Main.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", Main.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", Main.greet("Simon"));
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", Main.greet("Johnny"));
    }
}