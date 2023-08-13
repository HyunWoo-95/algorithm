package org.example.back.print;

import java.util.Scanner;

public class Main_8393 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int t= scr.nextInt();
        int sum = 0;
        for(int i = 1; i <= t; i++){
             sum += i;
        }
        System.out.println(sum);
    }
}
