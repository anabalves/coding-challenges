import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'steadyGene' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING gene as parameter.
     */
    public static int steadyGene(String gene) {
        int length = gene.length();
        int idealCountPerLetter = length / 4;

        int[] frequency = new int[4];
        for (char nucleotide : gene.toCharArray()) {
            frequency[indexOf(nucleotide)]++;
        }

        int[] excessNeededToCover = new int[4];
        boolean alreadyBalanced = true;
        for (int i = 0; i < 4; i++) {
            if (frequency[i] > idealCountPerLetter) {
                excessNeededToCover[i] = frequency[i] - idealCountPerLetter;
                alreadyBalanced = false;
            }
        }
        if (alreadyBalanced) {
            return 0;
        }

        int minimalWindowSize = length;
        int windowStart = 0;
        int[] windowCounts = new int[4];
        char[] chars = gene.toCharArray();

        for (int windowEnd = 0; windowEnd < length; windowEnd++) {
            windowCounts[indexOf(chars[windowEnd])]++;

            while (windowCoversExcess(windowCounts, excessNeededToCover)) {
                minimalWindowSize = Math.min(minimalWindowSize, windowEnd - windowStart + 1);
                windowCounts[indexOf(chars[windowStart])]--;
                windowStart++;
            }
        }

        return minimalWindowSize;
    }

    private static int indexOf(char nucleotide) {
        switch (nucleotide) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
        }
        return -1;
    }

    private static boolean windowCoversExcess(int[] windowCounts, int[] excessNeeded) {
        for (int i = 0; i < 4; i++) {
            if (windowCounts[i] < excessNeeded[i]) {
                return false;
            }
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String gene = bufferedReader.readLine().trim();

        int result = Result.steadyGene(gene);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
