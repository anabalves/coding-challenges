[🔗 View on HackerRank](https://www.hackerrank.com/challenges/compare-the-triplets/problem)

# Compare the Triplets

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points from 1 to 100 in three categories: problem clarity, originality, and difficulty.

---

### Function Signature

```java
int[] compareTriplets(int[] a, int[] b)
```

### Parameters

- `int a[3]`: Alice’s challenge ratings
- `int b[3]`: Bob’s challenge ratings

### Returns

- `int[2]`: Alice’s and Bob’s scores

---

### Input Format

- The first line contains 3 space-separated integers, the ratings for Alice’s challenge.
- The second line contains 3 space-separated integers, the ratings for Bob’s challenge.

### Constraints

- `1 ≤ a[i], b[i] ≤ 100`

---

### Sample Input 0

```
5 6 7
3 6 10
```

### Sample Output 0

```
1 1
```

### Sample Input 1

```
17 28 30
99 16 8
```

### Sample Output 1

```
2 1
```

---

### Explanation

Each score is compared category-wise. The one with the higher score receives 1 point. Equal scores receive no points. The output contains Alice’s and Bob’s final scores, respectively.
