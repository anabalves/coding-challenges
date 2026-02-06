class Solution {
    public int solution(int N) {
        while ((N & 1) == 0) {
            N >>= 1;
        }

        int maxGap = 0;
        int currentGap = 0;

        while (N != 0) {
            if ((N & 1) == 0) {
                currentGap++;
            } else {
                if (currentGap > maxGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            }
            N >>= 1;
        }

        return maxGap;
    }
}
