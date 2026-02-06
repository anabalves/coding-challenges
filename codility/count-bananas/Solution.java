class Solution {
    public int solution(String S) {
        if (S == null || S.length() < 6) return 0;

        int countB = 0;
        int countA = 0;
        int countN = 0;

        for (char c : S.toCharArray()) {
            if (c == 'B') countB++;
            else if (c == 'A') countA++;
            else if (c == 'N') countN++;
        }

        int maxFromB = countB; 
        int maxFromA = countA / 3;
        int maxFromN = countN / 2;

        return Math.min(maxFromB, Math.min(maxFromA, maxFromN));
    }
}
