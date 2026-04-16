package com.pluarlsight;

import java.util.Arrays;

public class TestStatistics {
    static void main() {
        int[] scores = {90, 98, 95, 69, 80, 78, 74, 40, 55, 100};

        int sum = 0;
        int max = 0;
        int min = scores[0];

        for (int score : scores){
            sum += score;
            if(score < min) {
                min = score;
            }
            if (score > max){
                max = score;
            }
        }
        double average = (double)sum / scores.length;
        System.out.println(average);
        System.out.println(max);
        System.out.println(min);

        Arrays.sort(scores);
        int middle = scores.length / 2;
        if (scores.length % 2 == 0) {
            System.out.println(scores[middle]);
            System.out.println(middle);
        } else {
            middle = (scores[middle] + scores[(middle - 1)]) / 2;
            System.out.println(middle);
        }

    }
}
