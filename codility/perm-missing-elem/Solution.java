class Solution {
    public int solution(int[] A) {
        final int n = A.length;

        final long expectedSum = ((long) (n + 1) * (n + 2)) / 2;

        long actualSum = 0L;
        for (int v : A) {
            actualSum += v;
        }

        return (int) (expectedSum - actualSum);
    }
}
