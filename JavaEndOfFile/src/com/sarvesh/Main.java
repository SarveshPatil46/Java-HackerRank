package com.sarvesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        String stringInput = "";
        int n = 1;
        while (scanner.hasNext()) {
            stringInput = scanner.nextLine();
            System.out.println(n + " " + stringInput);
            n++;
        }

        scanner.close();
    }
}
