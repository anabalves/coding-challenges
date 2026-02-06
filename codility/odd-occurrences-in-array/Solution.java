class Solution {
    public int solution(int[] A) {
        int xor = 0;
        for (int value : A) {
            xor ^= value;
        }
        return xor;
    }
}
