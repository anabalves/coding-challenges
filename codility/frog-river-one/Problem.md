# Frog River One

## Problem

A small frog wants to cross a river by jumping on leaves.
The frog starts on one bank at position **0** and wants to reach the opposite bank at position **X + 1**.

Leaves fall onto the river over time. The river is divided into positions from **1 to X**, and the frog can only cross when **every position from 1 to X has at least one leaf**.

You are given an array **A**, where `A[K]` represents the position where a leaf falls at second `K`.

Your task is to determine the **earliest time** when the frog can jump to the other side of the river.

If it is never possible, return **-1**.

---

## Function Signature

```java
class Solution { public int solution(int X, int[] A); }
```

---

## Input

* **X**: an integer representing the width of the river.
* **A**: a non-empty array of integers where:

  * `A[K]` is the position of a leaf at second `K`.

---

## Output

* An integer representing the **earliest second** when the frog can cross the river.
* Returns **-1** if the frog can never cross.

---

## Constraints

* `1 ≤ X ≤ 100,000`
* `1 ≤ N ≤ 100,000`
* `1 ≤ A[i] ≤ X`

---

## Example

### Input

```
X = 5
A = [1, 3, 1, 4, 2, 3, 5, 4]
```

### Explanation

* Leaves appear over time at different positions.
* At second **6**, a leaf falls at position **5**.
* At this moment, all positions from **1 to 5** are covered by at least one leaf.

### Output

```
6
```

---

## Notes

* The frog does **not** require leaves at positions `0` or `X + 1`.
* Repeated leaves at the same position do **not** provide additional benefit.
* The solution must be efficient due to large input sizes.
* An optimal solution runs in **O(N)** time and uses **O(X)** additional memory.
