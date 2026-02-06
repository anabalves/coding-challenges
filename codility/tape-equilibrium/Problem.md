# Tape Equilibrium

## Problem

A non-empty array **A** consisting of **N integers** is given.  
Array **A** represents numbers written on a tape.

Any integer **P**, such that `0 < P < N`, splits this tape into two **non-empty parts**:

- Left part: `A[0], A[1], ..., A[P − 1]`
- Right part: `A[P], A[P + 1], ..., A[N − 1]`

The **difference** between the two parts is defined as:

```

|(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

```

The goal is to compute the **minimal possible difference** that can be achieved by choosing an appropriate split point **P**.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* **A**: a non-empty array of integers representing values on the tape.

---

## Output

* An integer representing the **minimal absolute difference** between the sum of the two parts.

---

## Constraints

* `2 ≤ N ≤ 100,000`
* `−1,000 ≤ A[i] ≤ 1,000`

---

## Example

### Input

```
[3, 1, 2, 4, 3]
```

### Possible splits

* `P = 1` → `|3 − 10| = 7`
* `P = 2` → `|4 − 9| = 5`
* `P = 3` → `|6 − 7| = 1`
* `P = 4` → `|10 − 3| = 7`

### Output

```
1
```

---

## Notes

* Both parts of the tape must be **non-empty**.
* A naive solution recalculating sums for each split would be **O(N²)** and is not acceptable.
* An efficient solution uses:
  * One pass to compute the total sum.
  * A second pass maintaining a running prefix sum.
* The expected time complexity is **O(N)**.
* The expected space complexity is **O(1)** (excluding input).
