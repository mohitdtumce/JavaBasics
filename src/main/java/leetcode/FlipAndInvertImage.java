package leetcode;

public class FlipAndInvertImage {
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int r = 0; r < A.length; r++) {
            int cs = 0, ce = (A[r].length - 1);
            while (cs <= ce) {
                int temp = A[r][cs];
                A[r][cs] = ((A[r][ce] == 1) ? 0 : 1);
                A[r][ce] = ((temp == 1) ? 0 : 1);
                cs++;
                ce--;
            }
        }
        return A;
    }
}
