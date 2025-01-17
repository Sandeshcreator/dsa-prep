package com.basic.array;

import java.util.ArrayList;
import java.util.List;

public class KidsCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int adedNumb = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > adedNumb) {
                adedNumb = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if (adedNumb <= candies[j] + extraCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
