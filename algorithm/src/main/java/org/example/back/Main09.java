package org.example.back;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();
        int first = (a + b)%c;
        int second =  ((a%c) + (b%c))%c;
        int three = (a*b)%c;
        int forth = ((a%c) * (b%c))%c;
        System.out.println(first);
        System.out.println(second);
        System.out.println(three);
        System.out.println(forth);
    }
}
/*
(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 */
