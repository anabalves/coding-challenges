[🔗 View on HackerRank](https://www.hackerrank.com/challenges/matching-specific-string/problem)

# Matching Specific String

A regular expression is a sequence of characters that defines a search pattern. It is mainly used for string pattern matching.

In this challenge, your task is to find how many times the word `hackerrank` appears in a given block of text. The match must be **case-sensitive** and **exact**, no variations allowed.

---

### Function Signature

```java
int countOccurrences(String input, String word)
```

### Parameters

- `input`: a string that may contain multiple lines of text
- `word`: the exact word to match using regular expressions (for this problem, it will always be `"hackerrank"`)

### Returns

- `int`: total number of exact, case-sensitive matches of `word` found in `input`

---

### Input Format

- The input consists of one or more lines of text.

---

### Constraints

- Only lowercase `hackerrank` should be matched, other variations like `HackerRank` or `Hackerrank` should not match.

---

### Sample Input

```
The hackerrank team is on a mission to flatten the world by restructuring the DNA of every company on the planet. We rank programmers based on their coding skills, helping companies source great programmers and reduce the time to hire. As a result, we are revolutionizing the way companies discover and evaluate talented engineers. The hackerrank platform is the destination for the best engineers to hone their skills and companies to find top engineers.
```

---

### Sample Output

```
Number of matches : 2
```

---

### Explanation

The word `hackerrank` appears exactly two times in the input string. Since the matching is case-sensitive and exact, only those two are counted.