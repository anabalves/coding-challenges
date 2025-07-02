import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int size) {
        if (size <= 0)
            return;

        for (int row = 1; row <= size; row++) {
            int numberOfSpaces = size - row;
            int numberOfHashes = row;

            StringBuilder stepLine = new StringBuilder(size);
            stepLine.append(" ".repeat(numberOfSpaces));
            stepLine.append("#".repeat(numberOfHashes));

            System.out.println(stepLine);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
