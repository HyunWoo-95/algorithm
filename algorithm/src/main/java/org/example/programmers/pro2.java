package org.example.programmers;

public class pro2 {

    // while문은 틀림
//    public String solution(String[] cards1, String[] cards2, String[] goal) {
//        String answer = "yes";
//
//        int one = 0;
//        int two = 0;
//
//        int i = 0;
//        while(i<goal.length){
//            if(one < cards1.length &&goal[i].equals(cards1[one])){
//                one++;
//            }else if(two < cards2.length && goal[i].equals(cards2[two])){
//                two++;
//            } else{
//                answer = "No";
//                break;
//            }
//            i++;
//        }
//        return answer;
//    }
    //카드뭉치
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1 = 0;
        int card1max = cards1.length;
        int card2 = 0;
        int card2max = cards2.length;

        for(int i = 0; i<goal.length; i++){
            String curStr = goal[i];
            if(card1 < card1max && curStr.equals(cards1[card1])){
                card1++;
            }else if(card2 < card2max && curStr.equals(cards2[card2])){
                card2++;
            }else{
                return "No";
            }
        }
        return "Yes";
    }


}