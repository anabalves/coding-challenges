[🔗 View on HackerRank](https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem)

# Matching Anything But a Newline

The dot (`.`) in regular expressions matches any single character **except** a newline (`\n`).  
To match a **literal dot**, you must escape it using a backslash (`\.`). In Java, this becomes `\\.` due to double escaping.

---

### Task

You are given a test string `S`.  
Your task is to write a regular expression that matches **exactly** strings of the form:

```yaml
xxx.xxx.xxx.xxx
```

Where:
- Each `x` is any character **except a newline**
- Each dot (`.`) is a **literal dot**
- Each block contains **exactly 3 characters**

---

### Function Signature

```java
boolean matchesPattern(String input)
```

---

### Input Format

- A single string `S` (e.g., `123.456.abc.def`)

---

### Constraints

- The input must follow the format: four groups of exactly 3 characters, separated by literal dots.
- Newline characters (`\n`) are not allowed within groups.

---

### Output Format

- Print `true` if the string matches the pattern; otherwise, print `false`.

---

### Sample Input

```
123.456.abc.def
```

---

### Sample Output

```
true
```

---

### Explanation

The input has four groups: `123`, `456`, `abc`, and `def`.  
Each group has exactly 3 characters, separated by dots, and does not contain newlines.