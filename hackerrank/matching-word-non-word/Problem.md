[🔗 View on HackerRank](https://www.hackerrank.com/challenges/matching-word-non-word/problem)

# Matching Word & Non-Word Character

In regular expressions:
- `\w` matches any **word** character (i.e., `[a-zA-Z0-9_]`)
- `\W` matches any **non-word** character (i.e., anything **except** `[a-zA-Z0-9_]`)

In Java, due to escaping, these become `"\\w"` and `"\\W"`.

---

### Task

You are given a test string `S`.

Your task is to write a regular expression that matches the pattern:

```yaml
xxxXxxxxxxxxxxXxxx
```

Where:
- `x` denotes a **word** character (`\w`)
- `X` denotes a **non-word** character (`\W`)

---

### Function Signature

```java
boolean matchesPattern(String input)
```

---

### Input Format

- A single string `S`, read from standard input

---

### Output Format

- Print `true` if **any part** of the string matches the pattern  
- Otherwise, print `false`

---

### Sample Input

```
www.hackerrank.com
```

---

### Sample Output

```
true
```

---

### Explanation

The input contains the pattern:
- `www` → 3 word characters
- `.` → non-word character
- `hackerrank` → 10 word characters
- `.` → non-word character
- `com` → 3 word characters

This matches the required format.