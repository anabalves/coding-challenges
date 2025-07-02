import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void miniMaxSum(List<Integer> numbers) {
        long sumOfAllElements = 0;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for (int number : numbers) {
            sumOfAllElements += number;
            minElement = Math.min(minElement, number);
            maxElement = Math.max(maxElement, number);
        }

        long minimumPossibleSum = sumOfAllElements - maxElement;
        long maximumPossibleSum = sumOfAllElements - minElement;

        System.out.println(minimumPossibleSum + " " + maximumPossibleSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
