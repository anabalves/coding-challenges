class Solution {
    public int solution(int[] A) {
        int n = A.length;

        boolean[] seen = new boolean[n + 2];

        for (int v : A) {
            if (v >= 1 && v <= n + 1) {
                seen[v] = true;
            }
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!seen[i]) return i;
        }

        return n + 1;
    }
}
