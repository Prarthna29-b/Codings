package com.example.javacodings;

    class LongestWord{

        public static String LongestWord(String sen) {
            String[] words = sen.split(" ");  /* split the string on the basis of space */
            String[] cleanedWords = new String[words.length];  //intilize an  new Array to to store the words without specialCharacter
            for (int i = 0; i < words.length; i++) {
                cleanedWords[i] = words[i].replaceAll("[^a-zA-Z0-9]", "");//replace all the character except a to z,A to Z,0 to 9 with
            }                                                                       //null string

            String longest="";
            for (int i=0;i<cleanedWords.length;i++)
            {
                if(longest.length()<cleanedWords[i].length())
                    longest=cleanedWords[i];

            }

            return longest;
        }

        public static void main (String[] args) {

            System.out.print(LongestWord("hello!@ her ertyuh"));
        }

    }

