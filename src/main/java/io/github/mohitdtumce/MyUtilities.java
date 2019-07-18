package io.github.mohitdtumce;

public class MyUtilities {
    public static void printMatrix(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
