//package com.example.javacodings;/*package whatever //do not write package name here */
//// reverse string
//
//class ReverseString {
//	public static void main (String[] args) {
//	    String input ="HELLO";
//	    reverse(input);
//	}
//	   // logic 1 using for loop with string object:
//       String reverse ="";
// 	   char array[]=input.toCharArray();   // Converting the String to charArray using toCharArray() method
// 	   int size= array.length;
// 	   for( int i=size-1;i>=0;i--)        //  Traverse the String in Reverse Order
// 	   {
//            String element=Character.toString(array[i]);          // Convert a Character to String
//            reverse=reverse.concat(element);                     // Now append a Character using concat method
// 	   }
// 		System.out.println(reverse);
// 	// logic with StringBuilder
// 	StringBuilder sb = new StringBuilder();
// 	for( int i=input.length()-1;i>=0;i--)
// 	sb.append(input.charAt(i));
// 		System.out.println(sb);
//// // 		logic with recursion
//       static void reverse(String input)
//       {
//        if ((input==null)||(input.length() <= 1))
//           System.out.println(input);
//        else
//        {
//            System.out.print(input.charAt(input.length()-1));
//            reverse(input.substring(0,input.length()-1));
//        }
//       }
//    //length =5 input.charAt(4)
//    // ouput:OLLEH
//    // String input value :HELL HEL HE H
//
//}
