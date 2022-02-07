package com.sarvesh;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        char[] arrayA = A.toCharArray();
        char[] arrayB = B.toCharArray();


        System.out.print(Character.toUpperCase(A.charAt(0)));
        for (int i = 1; i < arrayA.length; i++) {
            System.out.print(arrayA[i]);
        }
        System.out.print(" ");

        System.out.print(Character.toUpperCase(B.charAt(0)));
        for (int i = 1; i < arrayB.length; i++) {
            System.out.print(arrayB[i]);
        }
    }


//    Another Method :
//
//public static void main(String[] args) {
//
//    Scanner sc = new Scanner(System.in);
//    String A = sc.next();
//    String B = sc.next();
//    System.out.println(A.length() + B.length());
//    System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
//    System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " " + B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));
//}
}
