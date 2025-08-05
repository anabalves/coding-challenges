import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the riddle function below.
    static long[] riddle(long[] arr) {
        int n = arr.length;
        int[] left  = new int[n];
        int[] right = new int[n];

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && arr[stack[top]] >= arr[i]) {
                top--;
            }
            left[i] = (top < 0 ? -1 : stack[top]);
            stack[++top] = i;
        }

        top = -1;
        for (int i = n - 1; i >= 0; i--) {
            while (top >= 0 && arr[stack[top]] >= arr[i]) {
                top--;
            }
            right[i] = (top < 0 ? n : stack[top]);
            stack[++top] = i;
        }

        long[] answer = new long[n + 1];
        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1;
            answer[len] = Math.max(answer[len], arr[i]);
        }
        for (int k = n - 1; k >= 1; k--) {
            answer[k] = Math.max(answer[k], answer[k + 1]);
        }

        long[] result = new long[n];
        for (int k = 1; k <= n; k++) {
            result[k - 1] = answer[k];
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] arr = new long[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        long[] res = riddle(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
