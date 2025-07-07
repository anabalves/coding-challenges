import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

    private static final String REGEX_PATTERN = "^.{3}\\..{3}\\..{3}\\..{3}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        boolean isValid = matchesPattern(input);
        System.out.println(isValid);
    }

    private static boolean matchesPattern(String input) {
        return Pattern.matches(REGEX_PATTERN, input);
    }
}
