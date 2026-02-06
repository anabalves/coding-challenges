# StoneWall

## Problem

You are going to build a stone wall. The wall should be straight and **N meters long**, and its thickness should be constant; however, it should have different heights in different places.

The height of the wall is specified by an array **H** of **N positive integers**.
`H[i]` is the height of the wall from `i` to `i + 1` meters to the right of its left end.

The wall should be built of **cuboid stone blocks** (that is, all sides of such blocks are rectangular).
Your task is to compute the **minimum number of blocks** needed to build the wall.

This is the classic **“Manhattan skyline”** / **StoneWall** problem.

---

## Function Signature

```java
class Solution { public int solution(int[] H); }
```

---

## Input

* **H**: an array of N positive integers representing the wall height at each segment.

---

## Output

* An integer representing the **minimum number of blocks** needed to build the wall.

---

## Constraints

* 1 ≤ N ≤ 100,000
* 1 ≤ H[i] ≤ 1,000,000,000

---

## Example

### Input

```
[8, 8, 5, 7, 9, 8, 7, 4, 8]
```

### Output

```
7
```

### Explanation

A valid optimal arrangement uses **7 blocks**.
Intuitively:

* When the height **stays the same**, the current block continues.
* When the height **decreases**, blocks that are taller must end.
* When the height **increases**, a new block must start at the new height.

---

## Notes

* The optimal solution uses a **monotonic stack** (stack of increasing heights).
* For each height `h`:
  * Pop while the stack top is **greater than `h`** (those blocks cannot continue).
  * If the stack is empty or stack top is **less than `h`**, push `h` and increment the block counter.
  * If the stack top is **equal to `h`**, do nothing (the existing block continues).
* Time complexity: **O(N)** — each height is pushed/popped at most once.
* Space complexity: **O(N)** in the worst case (strictly increasing sequence).
* This problem evaluates understanding of **stack-based greedy strategies**, **monotonic data structures**, and **efficient linear-time processing** for large inputs.
