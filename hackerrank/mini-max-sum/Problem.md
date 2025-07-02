[🔗 View on HackerRank](https://www.hackerrank.com/challenges/mini-max-sum/problem)

# Mini-Max Sum

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.  
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

---

### Function Signature

```java
void miniMaxSum(List<Integer> arr)
```

### Parameters

- `arr[5]`: a list of 5 positive integers

### Returns

- No return. Print two space-separated values: min sum and max sum.

---

### Input Format

- A single line of five space-separated integers.

### Constraints

- `1 ≤ arr[i] ≤ 10^9`

---

### Sample Input

```
1 2 3 4 5
```

### Sample Output

```
10 14
```

---

### Explanation

The numbers are `1, 2, 3, 4, 5`.  
The minimum sum is `1 + 2 + 3 + 4 = 10`.  
The maximum sum is `2 + 3 + 4 + 5 = 14`.  
So the function prints: `10 14`
