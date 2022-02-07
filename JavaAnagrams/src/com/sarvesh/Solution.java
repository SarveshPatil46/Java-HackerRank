package com.sarvesh;

import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        java.util.Hashtable<Character, Integer> arrayA = createHashtable(a.toLowerCase());
        java.util.Hashtable<Character, Integer> arrayB = createHashtable(b.toLowerCase());

        return arrayA.equals(arrayB);
    }

    private static java.util.Hashtable<Character, Integer> createHashtable(String a) {
        java.util.Hashtable<Character, Integer> array = new java.util.Hashtable<>();
        int count;
        for (int i = 0; i < a.length(); i++) {
            if (!array.containsKey(a.charAt(i))) {
                array.put(a.charAt(i), 1);
            } else {
                count = array.get(a.charAt(i));
                array.put(a.charAt(i), ++count);
            }
        }
        return array;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
