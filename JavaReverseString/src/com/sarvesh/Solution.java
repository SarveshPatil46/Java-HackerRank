package com.sarvesh;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean flag = false;
        for (int i = 0; i < A.length(); i++) {
            flag = A.charAt(i) == A.charAt(A.length() - 1 - i);
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
//    ANOTHER SOLUTION :
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//        System.out.println(A.equals(new StringBuilder(A).reverse().toString())
//                ? "Yes" : "No");
//
//    }
}
