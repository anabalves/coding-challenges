# Passing Cars

## Problem

A road is represented by a non-empty array `A` consisting of `N` integers.
Each element represents a car traveling on the road:

* `0` → a car traveling **east**
* `1` → a car traveling **west**

A pair of cars `(P, Q)` is considered **passing** if:

* `0 ≤ P < Q < N`
* Car `P` is traveling east (`A[P] = 0`)
* Car `Q` is traveling west (`A[Q] = 1`)

Your task is to compute the **number of passing car pairs**.

If the number of passing pairs exceeds **1,000,000,000**, the function must return `-1`.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* `A`: a non-empty array of integers where:

  * `0` represents a car traveling east
  * `1` represents a car traveling west

---

## Output

* An integer representing the **number of passing car pairs**
* Returns `-1` if the number exceeds **1,000,000,000**

---

## Constraints

* `1 ≤ N ≤ 100,000`
* Each element of `A` is either `0` or `1`

---

## Example

### Input

```
[0, 1, 0, 1, 1]
```

### Explanation

Passing pairs are:

* (0,1)
* (0,3)
* (0,4)
* (2,3)
* (2,4)

### Output

```
5
```

---

## Notes

* A naive `O(N²)` solution is not feasible due to input size.
* The problem can be solved in **O(N)** time by:
  * Counting east-bound cars seen so far.
  * For each west-bound car, adding the number of previous east-bound cars.
* Intermediate values must use `long` to avoid integer overflow.
* The solution should stop early and return `-1` if the limit is exceeded.
* Example tests are not part of the final score (Codility uses hidden tests).
