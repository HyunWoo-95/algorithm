package org.example.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Back03 {
    public static void main(String[] args) throws IOException {

//        //내가 짠 코드 시간 초과 (5분 기다림 ㅂㄷㅂㄷ)
//        Scanner sc = new Scanner(System.in);
//
//        int a[]; // 입력 받을숫자
//        int count = sc.nextInt(); // 입력 받을 숫자의 배열
//        a = new int[count];
//
//        for (int i = 0; i < count; i++) {
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        System.out.println(a);
//    }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int i = 0; i<n; i++){
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);

    }
}
