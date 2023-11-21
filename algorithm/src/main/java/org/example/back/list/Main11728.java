package org.example.back.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11728 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // a의 사이즈
    int M = sc.nextInt(); // b의 사이즈
    List<Integer> A = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int n = sc.nextInt();
      A.add(n);
    }
    List<Integer> B = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      int n = sc.nextInt();
      B.add(n);
    }

    List<Integer> result = new ArrayList<>();
    int i = 0; // A의 인덱스
    int j = 0; // B의 인덱스

    while (i < N && j < M) {
      int a = A.get(i);
      int b = B.get(j);

      if (a <= b) {
        result.add(a);
        i++;
      } else {
        result.add(b);
        j++;
      }
    }
    for (; i < N; i++) {
      result.add(A.get(i));
    }
    for (; j < M; j++) {
      result.add(B.get(j));
    }
    StringBuilder sb =new StringBuilder();
    for (int e : result){
      sb.append(e + " ");
    }
    System.out.println(sb.toString());
  }
}
