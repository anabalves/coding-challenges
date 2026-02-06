import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        Set<Integer> distinctValues = new HashSet<>();

        for (int value : A) {
            distinctValues.add(value);
        }

        return distinctValues.size();
    }
}
