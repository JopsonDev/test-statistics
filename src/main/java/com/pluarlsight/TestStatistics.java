package com.pluarlsight;

import java.util.Arrays;

public class TestStatistics {
    static void main() {
        int[] scores = {90, 98, 95, 69, 80, 78, 74, 40, 55, 100};
        int average = 0;
        for (int i = 0; i < 10; i++){
            average += scores[i];
        }
        average /= scores.length;
        System.out.println(average);

        int max = 0;

        for (int maxScore: scores) {
            if (maxScore > max){
                max = maxScore;
            }
        }
        System.out.println(max);

        int min = scores[0];

        for (int minScore : scores){
            if(minScore < min) {
                min = minScore;
            }
        }
        System.out.println(min);

    }
}
