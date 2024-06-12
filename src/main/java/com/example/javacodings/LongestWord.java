package com.example.javacodings;

    class Main {

        public static String LongestWord(String sen) {
            String[] words = sen.split(" ");
            String[] cleanedWords = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                cleanedWords[i] = words[i].replaceAll("[^a-zA-Z0-9]", "");
            }

            String longest="";
            for (int i=0;i<cleanedWords.length;i++)
            {
                if(longest.length()<cleanedWords[i].length())
                    longest=cleanedWords[i];

            }

            return longest;
        }

        public static void main (String[] args) {

            System.out.print(LongestWord("hello123 her ertyuh"));
        }

    }

