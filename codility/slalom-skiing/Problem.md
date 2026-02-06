# Slalom Skiing

## Problem

You are participating in a giant slalom and want to pass as many gates as possible while skiing downhill.

Each slalom gate is placed at a specific distance from the right-hand barrier and is represented by an integer value.
The arrangement of the gates is given as an array `A`, where `A[i]` represents the horizontal position of the `i`-th gate.

You always start skiing to the **left**, which means passing gates with **increasing values**.
During the run, you may change direction **at most two times**, so the path can be decomposed into **at most three monotonic parts**:

1. Increasing
2. Decreasing
3. Increasing

You are allowed to skip gates.
The goal is to compute the **maximum number of gates** that can be passed under these constraints.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* `A`: a non-empty array of integers representing gate positions.
* All values in `A` are distinct.

---

## Output

* An integer representing the **maximum number of gates** that can be passed in a single run.

---

## Constraints

* `1 ≤ N ≤ 100,000`
* `1 ≤ A[i] ≤ 1,000,000,000`
* All elements of `A` are distinct.

---

## Example

### Input

```
[15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3]
```

### Output

```
8
```

---

## Notes

* The skier may change direction **at most two times**, resulting in up to **three monotonic segments**.
* Gates may be skipped.
* The problem can be reduced to a variation of the **Longest Increasing Subsequence (LIS)** problem.
* A transformation is applied to model the three allowed movement phases.
* An optimal solution runs in **O(N log N)** time.
* Example tests are illustrative; Codility evaluates the solution using hidden test cases.
