import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            int a = A[i];
            int b = A[i + 1];
            int c = A[i + 2];

            if (a <= 0) {
                continue;
            }

            if ((long) a + (long) b > (long) c) {
                return 1;
            }
        }

        return 0;
    }
}
