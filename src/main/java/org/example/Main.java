package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(greet("John"));
    }
    public static String greet(String name) {
        return "Hello, " + (name.equals("Johnny") ?  "my love" : name) + "!";
    }
}