class Solution {
    private static final int LIMIT = 1_000_000_000;

    public int solution(int[] A) {
        long eastCount = 0L;
        long passingPairs = 0L;

        for (int car : A) {
            if (car == 0) {
                eastCount++;
            } else {
                passingPairs += eastCount;
                if (passingPairs > LIMIT) {
                    return -1;
                }
            }
        }

        return (int) passingPairs;
    }
}
