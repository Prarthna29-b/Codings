package org.example;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String args[])
    {
        Predicate <Integer> isEven = (n) -> n % 2 == 0;//used to store the condition
        System.out.println(isEven.test(5)); // Output: false
        if(isEven.test(10)) {//test() is imeplemented by Predicate interface, it takes an argument and returns a boolean value
            System.out.println("10 is even");
        } else {
            System.out.println("10 is odd");
        }
        Predicate<String> startsWithA = (s) -> s.startsWith("B");
        Predicate<String> endsWithE = (s) -> s.endsWith("E");
        Predicate<String> res=startsWithA.and(endsWithE); //Combining two predicates using and() method
        Predicate<String> res2=startsWithA.or(endsWithE); //Combining two predicates using or() method
        Predicate<String> notStartsWithA = startsWithA.negate(); //Negating the predicate using negate() method used to reverse the condition
// negate() method is used to reverse the condition of the predicate, so if the original predicate returns true, the negated predicate will return false and vice versa.
        System.out.println(res.test("Apple")); // Output: false
        System.out.println(res2.test("Apple")); // Output: true
        System.out.println(notStartsWithA.test("Apple")); // Output: false
    }
}
