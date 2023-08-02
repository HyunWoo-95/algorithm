package org.example.back.print;

import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String a = scr.next();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
