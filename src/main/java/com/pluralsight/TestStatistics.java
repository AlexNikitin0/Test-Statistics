package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {
        int total = 0;
        int[] scores = {100,65,25,99,93,84,72,60,98,12};
        Arrays.sort(scores);
        System.out.println(scores);

        for(int i = 0; i < scores.length; i++){

            System.out.println(scores[i] + " ");
            total += scores[i];

        }
        System.out.println(total);
        int average = total / scores.length;
        System.out.println("the average of these scores is: " + average);
        int highScore = scores[scores.length - 1];
        System.out.println("The highest score is: " + highScore);
        int lowestScore = scores[0];
        System.out.println("The lowest score is: " + lowestScore);
    }


}
