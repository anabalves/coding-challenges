import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(String S) {
        if (S == null || S.isEmpty()) {
            return 1;
        }

        Deque<Character> stack = new ArrayDeque<>(Math.min(S.length(), 1024));

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return 0;
            }

            char top = stack.pop();
            if (!matches(top, c)) {
                return 0;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '[' && close == ']')
            || (open == '{' && close == '}');
    }
}
