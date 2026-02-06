# Distinct

## Problem

Given an array **A** consisting of *N* integers, your task is to compute the **number of distinct values** present in the array.

Two values are considered distinct if they are not equal.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* **A**: an array of integers.

---

## Output

* An integer representing the number of **distinct values** in array **A**.
* Returns `0` if the array is empty.

---

## Constraints

* `0 ≤ N ≤ 100,000`
* `-1,000,000 ≤ A[i] ≤ 1,000,000`

---

## Example

### Input

```
[2, 1, 1, 2, 3, 1]
```

### Output

```
3
```

### Explanation

The distinct values appearing in the array are:

* `1`
* `2`
* `3`

Therefore, the function returns `3`.

---

## Notes

* The solution must be efficient for large inputs.
* A hash-based approach (e.g. `HashSet`) allows solving the problem in **O(N)** average time complexity.
* Sorting-based solutions are valid but less optimal, with **O(N log N)** complexity.
* Example tests provided by Codility are not part of the final score; additional hidden tests are used during evaluation.
