[🔗 View on HackerRank](https://www.hackerrank.com/challenges/plus-minus/problem)

# Plus Minus

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.  
Print each ratio on a new line with **6 digits** after the decimal point.

> This challenge tests precision handling. Answers with an absolute error of up to 10⁻⁴ are acceptable.

---

### Function Signature

```java
void plusMinus(List<Integer> arr)
```

### Parameters

- `arr[n]`: an array of integers

### Output Format

Print the ratios of positive, negative, and zero values in the array, **each on a new line**, with **6 decimal places**.

---

### Input Format

- The first line contains an integer `n`, the size of the array.
- The second line contains `n` space-separated integers.

---

### Constraints

- `0 < n ≤ 100`
- `-100 ≤ arr[i] ≤ 100`

---

### Sample Input

```
6
-4 3 -9 0 4 1
```

### Sample Output

```
0.500000
0.333333
0.166667
```

---

### Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.  
The proportions are:
- Positive: 3/6 = 0.500000
- Negative: 2/6 = 0.333333
- Zeros: 1/6 = 0.166667
