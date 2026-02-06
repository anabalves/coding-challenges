class Solution {
    public int solution(String S) {
        int best = -1;

        for (String word : S.trim().split("\\s+")) {
            int length = word.length();
            if (length == 0) continue;

            int letters = 0;
            int digits = 0;
            boolean valid = true;

            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);

                if (c >= '0' && c <= '9') {
                    digits++;
                } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <=  'Z')) {
                    letters++;
                } else {
                    valid = false;
                    break;
                }
            }

            if (valid && (letters % 2 == 0) && (digits % 2 == 1)) {
                best = Math.max(best, length);
            }
        }

        return best;
    }
}
