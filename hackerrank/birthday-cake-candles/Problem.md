[🔗 View on HackerRank](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)

# Birthday Cake Candles

You are in charge of the cake for a child's birthday. It will have one candle for each year of their age. They can only blow out the tallest candles. Your task is to count how many candles are the tallest.

---

### Function Signature

```java
int birthdayCakeCandles(List<Integer> candles)
```

### Parameters

- `candles`: a list of integers representing candle heights

### Returns

- `int`: the number of candles that are tallest

---

### Input Format

- The first line contains a single integer `n`, the number of candles.
- The second line contains `n` space-separated integers representing the candle heights.

---

### Constraints

- `1 ≤ n ≤ 10⁵`
- `1 ≤ candles[i] ≤ 10⁷`

---

### Sample Input

```
4
3 2 1 3
```

### Sample Output

```
2
```

---

### Explanation

Candle heights are `[3, 2, 1, 3]`.  
The tallest candle height is `3`, and it appears twice. So, the function returns `2`.
