[🔗 View on HackerRank](https://www.hackerrank.com/challenges/pairs/problem)

# Pairs

Given an array of integers and a target value `k`, determine the number of pairs of array elements that have a difference equal to `k`.

### Function Signature

```java
int pairs(int k, List<Integer> arr)
```

### Parameters
- **int k**: target difference
- **List<Integer> arr**: array of integers (each value is unique)

### Returns
- **int**: number of pairs `(a, b)` such that `b - a = k`

### Input Format
- The first line contains two space-separated integers `n` and `k`, the size of `arr` and the target value.
- The second line contains `n` space-separated integers of the array `arr`.

### Constraints
- `2 ≤ n ≤ 10^5`
- `0 < k < 10^9`
- `0 < arr[i] < 2^31 - 1`
- Each integer `arr[i]` will be **unique**

### Sample Input
```
5 2
1 5 3 4 2
```

### Sample Output
```
3
```

### Explanation
There are 3 pairs of integers in the set with a difference of `2`: `[5,3]`, `[4,2]` and `[3,1]`.
