# Highest International Students

Use the HTTP GET method to retrieve information from a global university database. Query https://jsonmock.hackerrank.com/api/universities to find all records. The query result is paginated and can be accessed by appending `?page=num` to the URL.

The response is a JSON object with the following fields:

- `page`: The current page of the results. (Number)
- `per_page`: The maximum number of results returned per page. (Number)
- `total`: The total number of results. (Number)
- `total_pages`: The total number of pages with results. (Number)
- `data`: Either an empty array or an array with a single object that contains the universities' records.

Each university object has the following schema:

- `university`: The name of the university (String)
- `rank_display`: The rank of the university according to the 2022 QS Rankings (String)
- `score`: The score of the university according to the 2022 QS Rankings (Number)
- `type`: The type of university (String)
- `student_faculty_ratio`: The ratio of students to faculty. (Number)
- `international_students`: The number of international students (String)
- `faculty_count`: The number of faculty (String)
- `location`: An object containing the location details. The object has the following schema:
  - `city`: (String)
  - `country`: (String)
  - `region`: (String)

---

### Function Signature

```java
String highestInternationalStudents(String firstCity, String secondCity)
```

### Parameters

- `firstCity`: name of the first city
- `secondCity`: name of the second city

### Returns

- `String`: the university with the highest number of international students in either city

---

### Input Format

Two strings, each representing a city.

### Constraints

- There is always a university in one of the two cities.

---

### Sample Input

```
Singapore
New York City
```

### Sample Output

```
National University of Singapore (NUS)
```