import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

class Result {

    private static final String BASE_URL = "https://jsonmock.hackerrank.com/api/universities?page=";

    /**
     * Complete the 'highestInternationalStudents' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING firstCity
     *  2. STRING secondCity
     *
     * Base URL: https://jsonmock.hackerrank.com/api/universities
     *
     */
    public static String highestInternationalStudents(String firstCity, String secondCity) {
        int page = 1;
        int totalPages = 1;

        University topUniversityFirstCity = null;
        University topUniversitySecondCity = null;

        try {
            do {
                JSONObject response = fetchPage(page);
                totalPages = response.getInt("total_pages");

                JSONArray universities = response.getJSONArray("data");

                for (int i = 0; i < universities.length(); i++) {
                    JSONObject university = universities.getJSONObject(i);
                    JSONObject location = university.getJSONObject("location");

                    String city = location.getString("city");
                    String name = university.getString("university");
                    String internationalStr = university.getString("international_students")
                                                        .replace(",", "").trim();

                    int internationalCount = internationalStr.isEmpty() ? 0 : Integer.parseInt(internationalStr);

                    University current = new University(name, internationalCount);

                    if (city.equalsIgnoreCase(firstCity)) {
                        if (topUniversityFirstCity == null || current.internationalStudents > topUniversityFirstCity.internationalStudents) {
                            topUniversityFirstCity = current;
                        }
                    } else if (city.equalsIgnoreCase(secondCity)) {
                        if (topUniversitySecondCity == null || current.internationalStudents > topUniversitySecondCity.internationalStudents) {
                            topUniversitySecondCity = current;
                        }
                    }
                }

                page++;
            } while (page <= totalPages);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (topUniversityFirstCity != null)
        ? topUniversityFirstCity.name
        : (topUniversitySecondCity != null ? topUniversitySecondCity.name : "");    
    }

    private static JSONObject fetchPage(int pageNumber) throws Exception {
        URL url = new URL(BASE_URL + pageNumber);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder responseBuffer = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                responseBuffer.append(line);
            }
            return new JSONObject(responseBuffer.toString());
        }
    }

    static class University {
        String name;
        int internationalStudents;

        University(String name, int internationalStudents) {
            this.name = name;
            this.internationalStudents = internationalStudents;
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String firstCity = bufferedReader.readLine();
        String secondCity = bufferedReader.readLine();

        String result = Result.highestInternationalStudents(firstCity, secondCity);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
