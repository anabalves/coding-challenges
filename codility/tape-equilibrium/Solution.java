class Solution {
    public int solution(int[] A) {
        final int n = A.length;

        long total = 0L;
        for (int v : A) total += v;

        long leftSum = 0L;
        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            leftSum += A[i];
            long rightSum = total - leftSum;

            long diff = leftSum - rightSum;
            if (diff < 0) diff = -diff;

            if (diff < minDiff) {
                minDiff = diff;

                if (minDiff == 0) return 0;
            }
        }

        return (int) minDiff;
    }
}
