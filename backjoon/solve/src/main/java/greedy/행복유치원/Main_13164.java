package greedy.행복유치원;

import java.io.*;
import java.util.*;

public class Main_13164 {

  static int child;
  static int group;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    child = Integer.parseInt(st.nextToken());
    group = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int price = 0;
    int[] tall = new int[child];

    int[] diff = new int[child - 1];

    for (int i = 0; i < tall.length; i++) {
      tall[i] = Integer.parseInt(st.nextToken());
    }
    for (int j = 0; j < child - 1; j++) {
      diff[j] = tall[j + 1] - tall[j];
    }
    Arrays.sort(diff);

    for (int i = 0; i <child - group; i++) {
      price += diff[i];
    }
    System.out.println(price);

  }

}
