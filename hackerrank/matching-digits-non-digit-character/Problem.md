[🔗 View on HackerRank](https://www.hackerrank.com/challenges/matching-digits-non-digit-characters/problem)

# Matching Digits & Non-Digit Characters

In regular expressions:
- `\d` matches any digit character `[0-9]`
- `\D` matches any character that is **not** a digit

In Java, due to escape sequences, they are written as `"\\d"` and `"\\D"`.

---

### Task

You are given a test string `S`.

Your task is to write a regular expression that matches the format:

```yaml
xxXxxXxxxx
```

Where:
- Each `x` represents a **digit**
- Each `X` represents a **non-digit** character

You must implement a function that checks whether **any substring** of the input string matches this exact format.

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
06-11-2015
```

---

### Sample Output

```
true
```

---

### Explanation

The input contains the substring:
- `06` → two digits
- `-` → one non-digit
- `11` → two digits
- `-` → one non-digit
- `2015` → four digits

This matches the required format.