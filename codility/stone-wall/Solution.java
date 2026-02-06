import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[] H) {
        if (H == null || H.length == 0) return 0;

        Deque<Integer> stack = new ArrayDeque<>();
        int blocks = 0;

        for (int h : H) {
            while (!stack.isEmpty() && stack.peek() > h) {
                stack.pop();
            }

            if (stack.isEmpty() || stack.peek() < h) {
                stack.push(h);
                blocks++;
            }
        }

        return blocks;
    }
}
