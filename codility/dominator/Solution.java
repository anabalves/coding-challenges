class Solution {
    public int solution(int[] A) {
        int n = (A == null) ? 0 : A.length;
        if (n == 0) return -1;

        int candidate = 0;
        int size = 0;

        for (int value : A) {
            if (size == 0) {
                candidate = value;
                size = 1;
            } else if (value == candidate) {
                size++;
            } else {
                size--;
            }
        }

        if (size == 0) return -1;

        int count = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (A[i] == candidate) {
                count++;
                index = i;
            }
        }

        return (count > n / 2) ? index : -1;
    }
}
