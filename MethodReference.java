package org.example;

import java.util.List;

public class MethodReference {
    public void add(String s) {
        System.out.println(s+"Hi");
    }
    public  static void upperCase(String s) {
        System.out.println(s.toUpperCase());
    }
    public static void main(String args[]) {
        MethodReference methodReference = new MethodReference();
        List<String> s = List.of("a", "b", "c");
        s.forEach(MethodReference::upperCase);
        s.forEach(methodReference::add); // Using method reference to call the add method of MethodReference class
        s.forEach(System.out::println); // Using method reference to print each element
//   :: used to refer a method by name, it is used to call a method by its name, it is used to refer a method of an object or class

    }
}