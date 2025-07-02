# Maximum Substring

A substring is a contiguous sequence of characters within a string.  
Given a string, determine the alphabetically maximum substring.

---

### Function Signature

```java
String maxSubstring(String s)
```

### Parameters

- `s`: a string

### Returns

- `String`: the maximum substring in `s` (alphabetically)

---

### Input Format

- A single line containing a string `s`.

---

### Constraints

- `1 ≤ length of s ≤ 100`
- All characters of `s` are in the range `a-z`

---

### Sample Input

```
banana
```

### Sample Output

```
nana
```

---

### Explanation

All substrings are ordered alphabetically and the one that comes last is `'nana'`.