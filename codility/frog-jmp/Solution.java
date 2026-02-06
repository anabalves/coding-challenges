class Solution {
    public int solution(int X, int Y, int D) {
        if (X >= Y) {
            return 0;
        }

        int distance = Y - X;

        return (distance + D - 1) / D;
    }
}
