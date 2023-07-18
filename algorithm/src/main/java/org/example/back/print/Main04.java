package org.example.back.print;

import java.util.Scanner;
public class Main04 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (scr.hasNext()) {
            int a, b;
            a = scr.nextInt();
            b = scr.nextInt();
            if (a==0 && b==0) break;
            System.out.println(a+b);

        }
    }
}
