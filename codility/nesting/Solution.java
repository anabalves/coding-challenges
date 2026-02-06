class Solution {
    public int solution(String S) {
        int balance = 0;

        for (int i = 0, n = S.length(); i < n; i++) {
            char c = S.charAt(i);
            if (c == '(') {
                balance++;
            } else {
                if (--balance < 0) {
                    return 0;
                }
            }
        }

        return balance == 0 ? 1 : 0;
    }
}
