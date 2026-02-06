# Fish

## Problem

You are given two non-empty arrays A and B consisting of N integers. Arrays A and B represent N voracious fish in a river, ordered downstream along the flow of the river.

Array A contains the sizes of the fish (all values are unique). Array B contains the directions:

* `0` → fish flowing upstream
* `1` → fish flowing downstream

If two fish move in opposite directions and there are no other (living) fish between them, they will eventually meet. Only one fish survives: the larger fish eats the smaller one. The goal is to compute the **number of fish that stay alive**.

---

## Function Signature

```java
class Solution { public int solution(int[] A, int[] B); }
```

---

## Input

* **A**: a non-empty array of integers representing fish sizes (all distinct).
* **B**: a non-empty array of integers representing fish directions (0 or 1).

---

## Output

* Returns an integer representing the **number of fish that stay alive**.

---

## Constraints

* 1 ≤ N ≤ 100,000
* 0 ≤ A[i] ≤ 1,000,000,000
* B[i] ∈ {0, 1}
* All elements of A are distinct.

---

## Example

### Input

[4, 3, 2, 1, 5]
[0, 1, 0, 0, 0]

### Output

2

### Explanation

Fish 1 (size 3, downstream) meets fish 2 (size 2) and eats it, then meets fish 3 (size 1) and eats it too. Finally, it meets fish 4 (size 5) and is eaten by it. Fish 0 and fish 4 never meet and therefore stay alive.

---

## Notes

* A meeting happens only when `P < Q`, `B[P] = 1` and `B[Q] = 0` and there are no living fish between them.
* A stack-based approach is optimal:
  * push sizes of fish flowing downstream (`B[i] = 1`)
  * when an upstream fish appears (`B[i] = 0`), it fights the downstream stack top until it dies or the stack becomes empty
* Each fish is pushed/popped at most once.
* Time complexity: **O(N)**
* Space complexity: **O(N)**
* Example tests are not part of the final score; Codility evaluates using hidden tests.
