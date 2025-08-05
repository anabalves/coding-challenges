import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
    /*
     * Complete the 'primeNumber' function below.
     *
     * The function is expected to return a STRING: "yes" if n is prime, otherwise "no".
     * The function accepts INTEGER n as parameter.
     */
    public static String primeNumber(int n) {
        if (n <= 1) {
            return "no";
        }

        if (n <= 3) {
            return "yes";
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return "no";
        }

        for (int i = 5; i * (long)i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return "no";
            }
        }

        return "yes";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String answer = Result.primeNumber(n);
        bufferedWriter.write(answer);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
