package org.example.back.print;

import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // 다음 줄로 포인터 이동

        String str = sc.nextLine(); // 문자열을 받음

        int sum = 0; // 숫자의 합계를 저장할 변수

        for (int i = 0; i < n; i++) {
            sum += str.charAt(i) - '0'; // charAt으로 해당 인덱스의 문자열을 char 타입으로 바꿈. char 타입끼리 연산하여 int형에 저장하면 아스키코드 값을 기반으로 연산하기 때문에 문자열 0을 빼줌. (아스키코드 0이 48인가 그렇습니다)
        }

        System.out.println(sum);
    }
}
