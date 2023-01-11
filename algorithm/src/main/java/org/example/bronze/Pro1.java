package org.example.bronze;

import java.util.Arrays;

public class Pro1 {
    public int main(String[] s1,String[] s2) {
        int answer = 0;
        for (String s : s1) {
            if (Arrays.stream(s2).anyMatch(s::equals)){
                answer++;
            }
        }
        return answer;

    }
}
