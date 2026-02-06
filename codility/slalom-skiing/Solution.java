import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int totalGates = A.length;
        if (totalGates < 2) {
            return totalGates;
        }

        int maxPosition = Arrays.stream(A).max().getAsInt();

        long[] lisTails = new long[totalGates * 3];
        int currentLisLength = 0;

        for (int position : A) {
            long[] potentialStates = {
                2L * maxPosition + position,
                2L * maxPosition - position,
                (long) position
            };

            for (long stateValue : potentialStates) {
                currentLisLength = updateLIS(lisTails, currentLisLength, stateValue);
            }
        }

        return currentLisLength;
    }

    private int updateLIS(long[] tails, int length, long value) {
        int low = 0;
        int high = length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (tails[mid] < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
    
        tails[low] = value;
        return (low == length) ? length + 1 : length;
    }
}
