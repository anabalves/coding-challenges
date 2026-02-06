# Max Product Of Three

## Problem

A non-empty array `A` consisting of `N` integers is given.
The product of a triplet `(P, Q, R)` is defined as:

```
A[P] * A[Q] * A[R]
```

where:

```
0 ≤ P < Q < R < N
```

Your task is to find the **maximum product of any triplet** in the array.

The array may contain **negative values**, which means the maximum product is not always obtained from the three largest elements.

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

* An integer representing the **maximum product** of any triplet.

---

## Constraints

* `3 ≤ N ≤ 100,000`
* `-1,000 ≤ A[i] ≤ 1,000`

---

## Example

### Input

```
[-3, 1, 2, -2, 5, 6]
```

### Output

```
60
```

### Explanation

Possible triplets include:

* `(-3, 1, 2)` → `-6`
* `(1, 2, 5)` → `10`
* `(2, 5, 6)` → `60`

The maximum product is `60`.

---

## Notes

* The maximum product can only come from:

  * The **three largest values**, or
  * The **two smallest (most negative) values multiplied by the largest value**
* Sorting-based solutions work but are less optimal (`O(N log N)`).
* An optimal solution runs in **O(N)** time and **O(1)** extra space.
* Intermediate calculations should use `long` to avoid overflow.
* Example tests are not part of the final score; Codility evaluates the solution using hidden tests.
