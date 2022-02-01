package com.sarvesh;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String lang = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d%n", lang, num);
        }
        System.out.println("================================");
    }
}
