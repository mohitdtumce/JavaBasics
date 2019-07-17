package io.github.mohitdtumce;

import leetcode.TwoSum;

import java.lang.*;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        int[] nums = {11, 2, 7, 15};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}

