# Triangle

## Problem

Determine whether a triangle can be built from a given set of edges.

An array **A** consisting of **N integers** is given. A triplet *(P, Q, R)* is **triangular** if:

* `0 ≤ P < Q < R < N`
* `A[P] + A[Q] > A[R]`
* `A[Q] + A[R] > A[P]`
* `A[R] + A[P] > A[Q]`

The task is to check whether **at least one triangular triplet** exists in the array.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* **A**: an array of integers representing edge lengths.

---

## Output

* Returns **1** if there exists at least one triangular triplet.
* Returns **0** otherwise.

---

## Constraints

* `0 ≤ N ≤ 100,000`
* Each element of array A is an integer in the range
  `[-2,147,483,648 .. 2,147,483,647]`

---

## Example

### Input

```
[10, 2, 5, 1, 8, 20]
```

### Output

```
1
```

### Explanation

One valid triangular triplet is `(0, 2, 4)`:

* `10 + 5 > 8`
* `5 + 8 > 10`
* `8 + 10 > 5`

All triangle inequalities are satisfied.

---

### Input

```
[10, 50, 5, 1]
```

### Output

```
0
```

### Explanation

No combination of three elements satisfies the triangle inequality.

---

## Notes

* A triangle **cannot** have sides with length `≤ 0`.
* After sorting the array, it is sufficient to check **consecutive triplets**:
  * If `A[i] + A[i + 1] > A[i + 2]`, the remaining inequalities are automatically satisfied.
* The solution:
  * Sorts the array.
  * Iterates once through consecutive triplets.
  * Uses `long` arithmetic to **avoid integer overflow**.
* Time complexity: **O(N log N)** (due to sorting).
* Space complexity: **O(1)** additional space (sorting is in-place for primitive arrays).
* This problem evaluates:
  * Understanding of **triangle inequality**
  * **Sorting-based optimization**
  * **Overflow-safe arithmetic**
  * Ability to reduce a naïve O(N³) approach to an efficient solution.
