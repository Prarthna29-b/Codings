package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {
//        List result = new FizzBuzz().fizzBuzz(5);
//        System.out.println(result);
//        int steps = new FizzBuzz().numberOfSteps(14);
//        System.out.println(steps);
        boolean canConstruct = new FizzBuzz().canConstruct("aa", "ab");
        System.out.println(canConstruct);
    }
            public List<String> fizzBuzz(int n) {
                List<String>res=new ArrayList<>();
                for(int i=1; i<=n; i++)
                {
                    if(i%3==0)
                        res.add("Fizz");
                    else if(i%5==0)
                        res.add("Buzz");
                     if(i%3==0&&i%5==0)
                        res.add("FizzBuzz");
                    else
                        res.add(String.valueOf(i));
                }
                return res;
            }

        public int numberOfSteps(int num) {
            int step=0;
            while(num>=0)
            {
                if(num%2==0)
                {
                    num=num/2;
                }
                else
                    num--;
                step++ ;
            }

            return step;
        }

        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> map = new HashMap<>();

            for (char c : magazine.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : ransomNote.toCharArray()) {
                if (!map.containsKey(c) || map.get(c) == 0) {
                    return false;
                }
                map.put(c, map.get(c) - 1);
            }

            return true;
        }
    }




