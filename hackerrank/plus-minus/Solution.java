import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void plusMinus(List<Integer> numbers) {
        int totalCount = numbers.size();

        long positiveCount = numbers.stream().filter(n -> n > 0).count();
        long negativeCount = numbers.stream().filter(n -> n < 0).count();
        long zeroCount = numbers.stream().filter(n -> n == 0).count();

        printFormattedRatio(positiveCount, totalCount);
        printFormattedRatio(negativeCount, totalCount);
        printFormattedRatio(zeroCount, totalCount);
    }

    private static void printFormattedRatio(long count, int total) {
        double ratio = (double) count / total;
        System.out.printf("%.6f%n", ratio);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
