class Solution {
    public int solution(int[] A) {
        int n = A.length;
        if (n < 3) return 0;

        int left = 0;
        int right = n - 1;

        int leftMax = A[left];
        int rightMax = A[right];

        int maxDepth = 0;

        while (left < right) {
            if (leftMax <= rightMax) {
                left++;
                leftMax = Math.max(leftMax, A[left]);
                maxDepth = Math.max(maxDepth, leftMax - A[left]);
            } else {
                right--;
                rightMax = Math.max(rightMax, A[right]);
                maxDepth = Math.max(maxDepth, rightMax - A[right]);
            }
        }

        return maxDepth;
    }
}
