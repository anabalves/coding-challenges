[🔗 View on HackerRank](https://www.hackerrank.com/challenges/the-birthday-bar/problem)

# Subarray Division

Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar such that:
- The length of the segment matches Ron's birth month, _m_.
- The sum of the integers on the squares is equal to his birth day, _d_.

Determine how many ways she can divide the chocolate.

---

### Function Signature

```java
int birthday(List<Integer> s, int d, int m)
```

### Parameters

- `List<Integer> s`: the numbers on each square of chocolate
- `int d`: Ron's birth day
- `int m`: Ron's birth month

### Returns

- `int`: the number of ways the bar can be divided according to the rules

### Input Format

- The first line contains an integer _n_, the number of squares in the chocolate bar.
- The second line contains _n_ space-separated integers, `s[i]`.
- The third line contains two space-separated integers, _d_ (day) and _m_ (month).

### Constraints

- `1 ≤ n ≤ 100`
- `1 ≤ s[i] ≤ 5`
- `1 ≤ d ≤ 31`
- `1 ≤ m ≤ 12`

### Sample Input 0

```
5
1 2 1 3 2
3 2
```

### Sample Output 0

```
2
```

### Explanation 0

She needs segments of length 2 that sum to 3.
Valid segments are `[1, 2]` and `[2, 1]`.

### Sample Input 1

```
6
1 1 1 1 1 1
3 2
```

### Sample Output 1

```
0
```

### Explanation 1

No 2-length segment sums to 3.

### Sample Input 2

```
1
4
4 1
```

### Sample Output 2

```
1
```

### Explanation 2

Only one square (length 1) with value 4 matches day = 4.
