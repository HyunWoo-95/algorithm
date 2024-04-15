package simulation.기적의매매법;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_20546 {

  static String answer; // 결과 값
  static String[] stock; // 주가
  static int jc, sc; // 준현, 성민의 보유 현금
  static int numJ, numS; // 준현, 성민의 보유 주식 수

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    int cash = Integer.parseInt(br.readLine()); // 주어지는 현금
    stock = br.readLine().split(" "); // 주어지는 주가는 공백을 두고 주어진다.

    // 현금 입금
    jc = cash;
    sc = cash;
// 거래는 14일간 진행
    for (int i = 0; i < 14; i++) {
      int money = Integer.parseInt(stock[i]); // 현재 주가

      // 준현의 매매
      if (jc != 0 && jc / money > 0) {
        numJ += jc / money;
        jc = jc % money;
        out.println(jc);
      }

      if (i > 2) {
        sTrading(money, i);
      }
    }
    // 금액 결상
    jc += numJ * Integer.parseInt(stock[13]);
    sc += numS * Integer.parseInt(stock[13]);

    if (jc > sc) {
      out.println("BNP");
    } else if (jc == sc) {
      out.println("SAMESAME");
    } else {
      out.println("TIMING");
    }
  }


  public static void sTrading(int money, int cnt) {
    // 성현의 매매법은 3일 연속 가격이 전날대비 상승하먄 전량 매도  하락하면 전량 매수
    int num3 = Integer.parseInt(stock[cnt - 3]); // 3일전
    int num2 = Integer.parseInt(stock[cnt - 2]); // 2일전
    int num1 = Integer.parseInt(stock[cnt - 1]); // 1일전

    if (numS != 0 && num1 < money && num2 < num1 && num3 < num2) {
      // 3일 연속 상승했다면 판매!
      sc += money * numS;
      numS = 0; // 전량 매도

    } else if (sc != 0 && sc / money > 0 && num1 > money && num2 > num1 && num3 > num2) {
      // 3일 연속 하락했다면 모두 구매!
      numS += sc / money;
      sc = sc % money;
    }

  }

  // TODO : 다른 풀이
//  int BNP, TIMING;
//  int bStock=0, tStock=0;
//  BNP = TIMING = Integer.parseInt(br.readLine());
//
//  int stock[] = new int[14];
//  StringTokenizer st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < stock.length; i++) {		// 주가입력
//    stock[i] = Integer.parseInt(st.nextToken());
//  }
//
//  int upCnt = 0;
//  int dwCnt = 0;
//  int prev = stock[0];
//		for (int i = 0; i < 14; i++) {
//    // 준현
//    int tmp = BNP/stock[i];
//    bStock += tmp;			// 주식구매
//    BNP -= tmp*stock[i];	// 지불
//
//    // 성민
//    if (stock[i] > prev) {
//      upCnt++;
//      dwCnt = 0;
//    } else if (stock[i] < prev) {
//      dwCnt++;
//      upCnt = 0;
//    }
//
//    if (dwCnt==3) {
//      int tmp2 = TIMING/stock[i];
//      TIMING -= tmp2*stock[i];
//      tStock += tmp2;
//    } else if (upCnt==3) {
//      tStock = 0;
//      TIMING += tStock * stock[i];
//    }
//  }
//
//
//  // 총 자산 계산
//  BNP += bStock * stock[13];
//  TIMING += tStock * stock[13];
//
//		System.out.println(BNP == TIMING ? "SAMESAME" : (BNP>TIMING ? "BNP" : "TIMING"));
}


