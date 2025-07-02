[🔗 View on HackerRank](https://www.hackerrank.com/challenges/a-very-big-sum/problem)

# A Very Big Sum

In this challenge, you must calculate and return the sum of elements in an array, where some integers may be very large.

---

### Function Signature

```java
long aVeryBigSum(int[] ar)
```

### Parameters

- `int ar[n]`: an array of integers

### Returns

- `long`: the sum of the array elements

---

### Input Format

- The first line contains an integer `n`, the number of elements.
- The second line contains `n` space-separated integers contained in the array.

### Constraints

- `1 ≤ n ≤ 10`
- `0 ≤ ar[i] ≤ 10¹⁰`

---

### Sample Input

```
5
1000000001 1000000002 1000000003 1000000004 1000000005
```

### Sample Output

```
5000000015
```

---

### Notes

The sum of the input values may exceed the range of a 32-bit integer. Be sure to use a 64-bit type (`long` in Java) to store the sum.
