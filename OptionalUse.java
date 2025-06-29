package org.example;

import java.util.Optional;

public class OptionalUse {
    public static void main(String args[]) {
        Optional<String> s = Optional.of("Hello");
        System.out.println(s);
        s.ifPresent(value -> System.out.println(value.toUpperCase()));
        s.ifPresentOrElse(
            value -> System.out.println("Value is present: " + value),
            () -> System.out.println("Value is not present")
        );
        System.out.println(s.orElse("no"));
        System.out.println(s.orElseGet(() -> "default value"));
        System.out.println(s.orElseThrow(() -> new RuntimeException("Value is not present")));
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent()); // Output: false
        System.out.println(emptyOptional.isEmpty()); // Output: true
        emptyOptional.ifPresent(value -> System.out.println(value.toUpperCase()));
        Optional<String> n= Optional.of("hey");
        Optional<String> m= Optional.ofNullable("heo");
        System.out.println(m);
    }
}