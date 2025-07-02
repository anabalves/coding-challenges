import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, University> topUniversityByCity = new HashMap<>();
        topUniversityByCity.put(firstCity.toLowerCase(), null);
        topUniversityByCity.put(secondCity.toLowerCase(), null);

        int currentPage = 1;
        int totalPages = 1;

        try {
            do {
                JSONObject pageData = fetchUniversitiesPage(currentPage++);
                totalPages = pageData.getInt("total_pages");
                JSONArray universities = pageData.getJSONArray("data");

                for (int i = 0; i < universities.length(); i++) {
                    JSONObject universityJson = universities.getJSONObject(i);
                    String city = universityJson.getJSONObject("location").optString("city", "");

                    boolean isInFirstCity = city.equalsIgnoreCase(firstCity);
                    boolean isInSecondCity = city.equalsIgnoreCase(secondCity);
                    if (!isInFirstCity && !isInSecondCity) continue;

                    String keyCity = isInFirstCity ? firstCity.toLowerCase() : secondCity.toLowerCase();
                    String name = universityJson.optString("university", "");

                    String rawCount = universityJson.optString("international_students", "").replace(",", "").trim();
                    if (rawCount.isEmpty()) continue;

                    int internationalCount = Integer.parseInt(rawCount);
                    University currentUniversity = new University(name, internationalCount);
                    University currentTop = topUniversityByCity.get(keyCity);

                    if (currentTop == null || currentUniversity.internationalStudents > currentTop.internationalStudents) {
                        topUniversityByCity.put(keyCity, currentUniversity);
                    }
                }
            } while (currentPage <= totalPages);
        } catch (Exception ex) {
            System.err.println("Error fetching data: " + ex.getMessage());
            return "";
        }

        University topFirstCity = topUniversityByCity.get(firstCity.toLowerCase());
        University topSecondCity = topUniversityByCity.get(secondCity.toLowerCase());

        if (topFirstCity != null && topSecondCity != null) {
            return topFirstCity.internationalStudents > topSecondCity.internationalStudents
                    ? topFirstCity.universityName
                    : topSecondCity.universityName;
        }

        return topFirstCity != null ? topFirstCity.universityName
                : topSecondCity != null ? topSecondCity.universityName
                : "";
    }

    private static JSONObject fetchUniversitiesPage(int pageNumber) throws IOException {
        URL url = new URL(BASE_URL + pageNumber);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
            }
            return new JSONObject(jsonBuilder.toString());
        }
    }

    static class University {
        String universityName;
        int internationalStudents;

        University(String universityName, int internationalStudents) {
            this.universityName = universityName;
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
