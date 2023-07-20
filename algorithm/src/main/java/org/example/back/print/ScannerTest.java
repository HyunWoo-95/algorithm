package org.example.back.print;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        String str;
        System.out.println("str입력");
        str = input.nextLine();


        System.out.println("num입력");
        num = input.nextInt();

        System.out.println("str : " + str);
        System.out.println("num : " + num);

        input.close();
    }
}
