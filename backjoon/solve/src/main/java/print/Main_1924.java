package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1924 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken()); // month
    int y = Integer.parseInt(st.nextToken()); // day
////    String day;
////    LocalDate lc = LocalDate.of(2007, x, y);
////    day = DayOfWeek.of(lc.getDayOfMonth()).toString();
////    switch (day) {
////      case "MONDAY":
////        System.out.println("MON");
////        break;
////      case "WEDNESDAY":
////        System.out.println("WED");
////        break;
////      case "THURSDAY":
////        System.out.println("THU");
////        break;
////      case "TUESDAY":
////        System.out.println("TUE");
////        break;
////      case "FRIDAY":
////        System.out.println("FRI");
////        break;
////      case "SATURDAY":
////        System.out.println("SAT");
////        break;
////      case "SUNDAY":
////        System.out.println("SUN");
////        break;
////      default:
////        System.out.println("no");
////        break;
////    }
////  }
    int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int n = 0; // 현재의 날짜 -1
    for (int i = 0; i < x; i++) {
      n += m[i];
      System.out.println(n += m[i]);
    }
    n += y - 1;
    System.out.println(n += y - 1);
    System.out.println(day[n % 7]);
  }
}



