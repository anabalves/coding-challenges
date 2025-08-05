[🔗 View on HackerRank](https://www.hackerrank.com/challenges/min-max-riddle/problem)

# Min Max Riddle

Given an integer array of size _n_, find the maximum of the minimum(s) of every window size in the array.  
The window size varies from 1 to _n_.  

For example, given `arr = [6, 3, 5, 1, 12]`,  
- windows of size 1 are (6), (3), (5), (1), (12) → minima 6, 3, 5, 1, 12 → maximum 12  
- windows of size 2 are (6,3), (3,5), (5,1), (1,12) → minima 3, 3, 1, 1 → maximum 3  
- … and so on, producing the final answer `[12, 3, 3, 1, 1]`.

---

### Function Signature

```java
long[] riddle(long[] arr)
```

### Parameters

- `long arr[n]`: an array of integers

### Returns

- `long[]`: an array of length n where the _k_th element is the maximum among all window-minimums for window size _k_ (1-based).

### Input Format

- The first line contains a single integer _n_, the size of `arr`.
- The second line contains _n_ space-separated integers, each an element of `arr`.

### Constraints

- `1 ≤ n ≤ 10^6`
- `0 ≤ arr[i] ≤ 10^9`

### Sample Input

```
4
2 6 1 12
```

### Sample Output

```
12 2 1 1
```

### Explanation

- Window size 1: minima are 2, 6, 1, 12 → max 12
- Window size 2: minima are min(2,6)=2, min(6,1)=1, min(1,12)=1 → max 2
- Window size 3: minima are 1, 1 → max 1
- Window size 4: minima is 1 → max 1
