# PermCheck

## Problem

A non-empty array `A` consisting of `N` integers is given.

A **permutation** is a sequence containing **each element from `1` to `N` exactly once**, with no missing or duplicated values.

For example, the array:

```
A = [4, 1, 3, 2]
```

is a permutation of size `4`.

However, the array:

```
A = [4, 1, 3]
```

is **not** a permutation, because the value `2` is missing.

The goal is to check whether array `A` is a permutation.

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

* Returns `1` if array `A` is a permutation.
* Returns `0` otherwise.

---

## Constraints

* `1 ≤ N ≤ 100,000`
* `1 ≤ A[i] ≤ 1,000,000,000`

---

## Example

### Input

```
[4, 1, 3, 2]
```

### Output

```
1
```

### Input

```
[4, 1, 3]
```

### Output

```
0
```

---

## Notes

* Every value in a valid permutation must be within the range `[1..N]`.
* Each value must appear **once and only once**.
* The solution must be efficient in both **time and memory**, as the input size can be large.
* An optimal solution runs in **O(N)** time and uses **O(N)** additional space.
* Sorting-based solutions are valid but less optimal (`O(N log N)`).
