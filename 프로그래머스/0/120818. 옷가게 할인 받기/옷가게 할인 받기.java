class Solution {
    public int solution(int price) {
        int answer = 0;
        // if(price >= 100000 && price < 300000) {
        //     answer = price - (price / 100 * 5);
        // } else if ( price >= 300000 && price < 500000){
        //     answer = price - (price / 100 * 10);
        // } else if (price >= 500000){
        //     answer = price - (price / 100 * 20);
        // }
        if(500000 <= price)return (int)(price * 0.8);
        if(300000 <= price)return (int)(price * 0.9);
        if(100000 <= price)return (int)(price * 0.95);
        return price;
    }
}