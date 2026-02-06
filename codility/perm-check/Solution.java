class Solution {
    public int solution(int[] A) {
        final int n = A.length;
        final boolean[] seen = new boolean[n + 1];

        for (int v : A) {
            if (v < 1 || v > n) {
                return 0;
            }

            if (seen[v]) {
                return 0;
            }

            seen[v] = true;
        }

        return 1;
    }
}
