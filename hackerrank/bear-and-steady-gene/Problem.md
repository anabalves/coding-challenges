[🔗 View on HackerRank](https://www.hackerrank.com/challenges/bear-and-steady-gene/problem)

# Bear and Steady Gene

A gene is represented as a string of length _n_ (where _n_ is divisible by 4), composed of the letters A, C, T, and G. A gene is considered **steady** if each of the four letters occurs exactly _n_ ⁄ 4 times.  

Bear Limak can choose **one** (possibly empty) substring of **gene** and replace it with any string of the **same length**. What is the **minimum length** of the substring he must replace to make **gene** steady?

---

### Function Signature

```java
int steadyGene(String gene)
```

### Parameters

- `String gene`: the original gene string of length _n_

### Returns

- `int`: the length of the smallest substring that can be replaced to make **gene** steady

### Input Format

- The first line contains an integer _n_, the length of **gene**.
- The second line contains the string **gene** (length _n_), consisting only of ‘A’, ‘C’, ‘G’, and ‘T’.

### Constraints

- `4 ≤ n ≤ 500 000`
- _n_ is divisible by 4
- Each character of **gene** ∈ {A, C, G, T}

### Sample Input

```
8
GAAATAAA
```

### Sample Output

```
5
```

### Explanation

One optimal replacement is the substring `AAATA` (length 5), replacing it with e.g. `TTCCG` to obtain `GTTCCGAA`, in which each letter appears exactly 2 times.
