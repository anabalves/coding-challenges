# Cyclic Rotation

## Problem

An array rotation consists of shifting each element of the array one position to the right, with the last element moved to the first position.

Given an array `A` consisting of `N` integers and an integer `K`, the task is to **rotate the array to the right `K` times** and return the resulting array.

The rotation is *cyclic*, meaning elements that move past the last index reappear at the beginning.

---

## Function Signature

```java
class Solution { public int solution(int[] A, int K); }
```

---

## Input

* **A**: an array of integers representing the original sequence.
* **K**: a non-negative integer representing the number of right rotations.

---

## Output

* An array representing `A` rotated to the right `K` times.
* If the array is empty or `K` is a multiple of the array length, the original array is returned unchanged.

---

## Constraints

* `0 ≤ N ≤ 100`
* `0 ≤ K ≤ 100`
* Each element of `A` is an integer in the range `[-1,000 .. 1,000]`

---

## Example

### Input

```
A = [3, 8, 9, 7, 6]
K = 3
```

### Rotations

```
[3, 8, 9, 7, 6] → [6, 3, 8, 9, 7]
[6, 3, 8, 9, 7] → [7, 6, 3, 8, 9]
[7, 6, 3, 8, 9] → [9, 7, 6, 3, 8]
```

### Output

```
[9, 7, 6, 3, 8]
```

---

## Notes

* Rotations greater than the array length are optimized using `K % N`.
* The solution returns a **new array**, avoiding side effects on the input.
* The approach prioritizes **correctness and clarity**, which is sufficient given the problem constraints.
* Time complexity is **O(N)** and space complexity is **O(N)**.
