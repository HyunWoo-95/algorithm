package org.example.back.print;

import java.util.Scanner;
// 런타임에러 (StringIndexOutOfBoundsException)
public class Main10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int tc = scr.nextInt();
        String str = scr.nextLine();
        int result = 0;
        for (int i = 0; i < tc; i++) {
            result += str.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
