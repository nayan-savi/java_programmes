package com.examples.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveStarRating {

    public static int getTimes(List<List<Integer>> productRatings, int ratingThreshold) {
        int required = 0;
        int length = productRatings.size() - 1;
        double calculated = 0;
        for (int i = 0; i < length; i++) {
            List<Integer> productRating = productRatings.get(i);
            Integer fiveStar = productRating.get(0);
            Integer total = productRating.get(1);
            calculated += (double) fiveStar / total;
        }
        double nextCalculate = 0;
        double res = 0;
        boolean first = false;
        List<Integer> productRating = productRatings.get(length);
        Integer fiveStar = productRating.get(0);
        Integer total = productRating.get(1);
        while (res <= ratingThreshold) {
            if (first) {
                fiveStar = fiveStar + 1;
                total = total + 1;
                nextCalculate = ( double)  fiveStar/total;
                required++;
            } else {
                nextCalculate = (double) fiveStar / total;
                first = true;
            }
            res = (calculated + nextCalculate) / productRatings.size();
            res = res * 100;
        }


        return required;
    }

    public static void main(String[] args) {
        List<List<Integer>> productRatings = new ArrayList<>();
        productRatings.add(Arrays.asList(4, 4));
        productRatings.add(Arrays.asList(1, 2));
        productRatings.add(Arrays.asList(3, 6));

        int ratingThreshold = 77;

        int times = getTimes(productRatings, ratingThreshold);
        System.out.println(times);
    }
}
