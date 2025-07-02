[🔗 View on HackerRank](https://www.hackerrank.com/challenges/time-conversion/problem)

# Time Conversion

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

---

### Function Signature

```java
String timeConversion(String s)
```

---

### Parameters

- `s`: a string representing the time in 12-hour format (`hh:mm:ssAM` or `hh:mm:ssPM`)

---

### Returns

- `String`: the converted time in 24-hour format (`HH:mm:ss`)

---

### Input Format

A single string `s` in 12-hour clock format.

---

### Constraints

- All input strings are valid

---

### Sample Input

```
07:05:45PM
```

### Sample Output

```
19:05:45
```

---

### Notes

- `12:00:00AM` is `00:00:00`
- `12:00:00PM` is `12:00:00`
