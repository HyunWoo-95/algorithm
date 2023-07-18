package org.example.back.print;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int t = scr.nextInt();
        for (int i  = 0; i< t; i++){
            int a, b;
            String[] numbers = scr.next().split(",");
            a= Integer.parseInt(numbers[0]);
            b= Integer.parseInt(numbers[1]);
            System.out.println(a+b);
        }
    }
}
