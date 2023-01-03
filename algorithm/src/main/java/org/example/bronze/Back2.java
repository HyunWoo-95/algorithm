package org.example.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Back2 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        sc.close();
//
//        System.out.println(a*(b%10)); // 1번째 숫자의 1의 자리 수 구하기
//        System.out.println(a*((b%100)/10)); // 10의 자리 수 구하기
//        System.out.println(a*(b/100)); // 100의 자리 수 구하기
//        System.out.println(a*b);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(a*(b%10));
        sb.append('\n');

        sb.append(a*((b%100)/10));
        sb.append('\n');

        sb.append(a*(b/100));
        sb.append('\n');

        sb.append(a*b);

        System.out.print(sb);


    }
}
