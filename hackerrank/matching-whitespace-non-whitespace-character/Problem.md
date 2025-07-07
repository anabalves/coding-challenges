[🔗 View on HackerRank](https://www.hackerrank.com/challenges/matching-whitespace-non-whitespace-character/problem)

# Matching Whitespace & Non-Whitespace Characters

In regular expressions:
- `\s` matches any **whitespace** character (`[ \r\n\t\f]`)
- `\S` matches any **non-whitespace** character

In Java, due to escaping, these become `"\\s"` and `"\\S"`.

---

### Task

You are given a test string `S`.

Your task is to write a regular expression that matches the pattern:

```yaml
XXxXXxXX
```

Where:
- `X` represents a **non-whitespace** character (`\S`)
- `x` represents a **whitespace** character (`\s`)

You must implement a function that checks whether **any substring** of the input string matches this format.

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
12 11 15
```

---

### Sample Output

```
true
```

---

### Explanation

The input contains the pattern:
- `12` → two non-whitespace characters
- ` ` → one whitespace character
- `11` → two non-whitespace characters
- ` ` → one whitespace character
- `15` → two non-whitespace characters

This matches the required format.