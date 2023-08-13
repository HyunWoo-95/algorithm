package org.example.back.print;

import java.util.Arrays;
import java.util.Scanner;
public class Main_10819 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = scr.nextInt();
        }

        int ans = 0;
        Arrays.sort(array);
        do {
            ans = Math.max(ans, getFormulaResult(array));
        }while (nextPermutation(array));
        System.out.printf("%d\n", ans);

    }
    private static boolean nextPermutation(int[] array) {
        int i = array.length - 1;
        while(i > 0 && array[i-1] >= array[i]) i--;
        if(i <= 0) return false;

        int j = array.length - 1;
        while(array[i-1] >= array[j]) j--;

        swap(array, i-1, j);
        j = array.length - 1;
        while(i < j) {
            swap(array, i, j);
            i++; j--;
        }
        return true;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    private static int getFormulaResult(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += Math.abs(array[i] - array[i + 1]);
        }
        return sum;
    }
}
