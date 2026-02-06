import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[] A, int[] B) {
        Deque<Integer> downstream = new ArrayDeque<>();
        int aliveUpstream = 0;

        for (int i = 0; i < A.length; i++) {
            int size = A[i];
            int dir = B[i];

            if (dir == 1) {
                downstream.push(size);
                continue;
            }

            boolean eaten = false;
            while (!downstream.isEmpty()) {
                int opponent = downstream.peek();
                if (opponent > size) {
                    eaten = true;
                    break;
                } else {
                    downstream.pop();
                }
            }

            if (!eaten) {
                aliveUpstream++;
            }
        }

        return aliveUpstream + downstream.size();
    }
}
