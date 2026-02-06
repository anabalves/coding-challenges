# Missing Integer

## Problem

Given a non-empty array `A` of integers, your task is to find the **smallest positive integer (greater than 0) that does not occur in the array**.

The solution must efficiently handle large input sizes.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* `A`: a non-empty array of integers.

---

## Output

* An integer representing the **smallest positive integer missing** from the array.

---

## Constraints

* `1 ≤ N ≤ 100,000`
* `-1,000,000 ≤ A[i] ≤ 1,000,000`

---

## Example

### Input

```
[1, 3, 6, 4, 1, 2]
```

### Output

```
5
```

### Explanation

The positive integers present in the array are `{1, 2, 3, 4, 6}`.
The smallest positive integer that does not occur in the array is `5`.

---

## Notes

* Only **positive integers** are relevant to the problem.
* Values less than `1` and greater than `N + 1` can be safely ignored.
* The expected time complexity is **O(N)**.
* The expected space complexity is **O(N)** or **O(1)**, depending on the chosen approach.
* This problem is commonly used to evaluate knowledge of **array indexing**, **hashing**, and **in-place algorithms**.
