[🔗 View on HackerRank](https://www.hackerrank.com/challenges/diagonal-difference/problem)

# Diagonal Difference

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

---

### Function Signature

```java
int diagonalDifference(List<List<Integer>> arr)
```

### Parameters

- `arr[n][m]`: a square 2D list of integers

### Returns

- `int`: the absolute difference between diagonal sums

---

### Input Format

- The first line contains an integer `n`, the matrix size.
- Each of the next `n` lines contains `n` space-separated integers.

### Constraints

- `-100 ≤ arr[i][j] ≤ 100`

---

### Sample Input

```
3
11 2 4
4 5 6
10 8 -12
```

### Sample Output

```
15
```

---

### Explanation

Primary diagonal: 11 + 5 + (-12) = 4  
Secondary diagonal: 4 + 5 + 10 = 19  
Absolute difference = |4 - 19| = 15
