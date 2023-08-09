package org.example.back.print;

import java.util.Calendar;
import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        int m = scr.nextInt();
        int d = scr.nextInt();
        String str = "";
        if (m >=1 && m <= 12 && d >= 1 && d <= 31) {
            calendar.set(2007, m - 1, d);
            int week = calendar.get(Calendar.DAY_OF_WEEK);
            switch (week) {
                case 1:
                    str = "SUN";
                    break;
                case 2:
                    str = "MON";
                    break;
                case 3:
                    str = "TUE";
                    break;
                case 4:
                    str = "WED";
                    break;
                case 5:
                    str = "THU";
                    break;
                case 6:
                    str = "FRI";
                    break;
                case 7:
                    str = "SAT";
                    break;
            }
            System.out.println(str);
        }else {
            System.out.println("error");
        }

    }
}
