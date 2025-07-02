import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'maxSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String maxSubstring(String word) {
        // testar cada sufixo e ver qual é maior em ordem alfabética
        String biggest = "";

        for (int i = 0; i < word.length(); i++) {
            String current = word.substring(i);

            // se o sufixo for maior que o maior atual deve atualizar
            if (current.compareTo(biggest) > 0) {
                biggest = current;
            }
        }

        return biggest;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String s = bufferedReader.readLine();

        String result = Result.maxSubstring(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}