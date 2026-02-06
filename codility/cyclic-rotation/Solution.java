class Solution {
    public int[] solution(int[] A, int K) {
        if (A == null || A.length == 0) {
            return A;
        }

        int n = A.length;
        int shift = K % n;

        if (shift == 0) {
            return A;
        }

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + shift) % n] = A[i];
        }

        return rotated;
    }
}
