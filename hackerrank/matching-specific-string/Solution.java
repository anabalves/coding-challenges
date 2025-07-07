import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    private static final String TARGET_WORD = "hackerrank";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = readAllInput(reader);
            int occurrences = countOccurrences(input, TARGET_WORD);
            System.out.printf("Number of matches : %d%n", occurrences);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static String readAllInput(BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append(System.lineSeparator());
        }
        return content.toString();
    }

    private static int countOccurrences(String input, String word) {
        Matcher matcher = Pattern.compile(word).matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
