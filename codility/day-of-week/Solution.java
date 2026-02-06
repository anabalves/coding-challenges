import java.util.Arrays;
import java.util.List;

class Solution {
    private static final List<String> DAYS = Arrays.asList( "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

    public String solution(String S, int K) {
        if (S == null) return "";

        int currentIndex = DAYS.indexOf(S);
        
        if (currentIndex == -1) return "";

        int targetIndex = (currentIndex + K) % 7;

        return DAYS.get(targetIndex);
    }
}
