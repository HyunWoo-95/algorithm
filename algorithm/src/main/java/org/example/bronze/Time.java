package org.example.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Time {
    public static void main(String[] args) throws IOException {
        // 스캐너 사용 풀이
//        Scanner in = new Scanner(System.in);
//        int h = in.nextInt(); // 시
//        int m = in.nextInt(); // 분
//        in.close();
//
//        if(m<45){
//            h--; //시 감소
//            m = 60 - (45-m); //분 감소
//            if(h<0){
//                h = 23;
//            }
//            System.out.println(h + " " + m);
//        }
//        else {
//            System.out.println(h + " " + (m-45));
//        }
        // BufferedReade 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //readLine() 은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있다.
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " "); // StringTokenizer 클래스를 이용한 분리 방법
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // st.nextToken은 문잘열을 반환하기에 Integer.parseInt()로 int 형으로 변환시켜준다.

        if (m < 45) {
            h--;
            m = 60 - (45 - m); //분 감소
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }

    }
}

