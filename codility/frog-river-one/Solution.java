class Solution {
    public int solution(int X, int[] A) {
        if (X <= 0) return 0;
        if (A == null || A.length == 0) return -1;

        boolean[] covered = new boolean[X + 1];
        int remaining = X;

        for (int t = 0; t < A.length; t++) {
            int pos = A[t];

            if (pos < 1 || pos > X) continue;

            if (!covered[pos]) {
                covered[pos] = true;
                remaining--;

                if (remaining == 0) {
                    return t;
                }
            }
        }

        return -1;
    }
}
