# Dominator 

## Problem

An array **A** consisting of *N* integers is given. The **dominator** of array A is the value that occurs in **more than half** of the elements of A.

For example, consider array A such that:

A[0] = 3    A[1] = 4    A[2] = 3
A[3] = 2    A[4] = 3    A[5] = -1
A[6] = 3    A[7] = 3

The dominator of A is 3 because it occurs in 5 out of 8 elements of A (indices 0, 2, 4, 6 and 7) and 5 is more than half of 8.

The goal is to return an **index of any occurrence** of the dominator, or **-1** if there is no dominator.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* **A**: an array of integers.

---

## Output

* Returns an integer representing an **index** of any element in which the dominator occurs.
* Returns **-1** if the array does not have a dominator.

---

## Constraints

* 0 ≤ N ≤ 100,000
* Each element of A is an integer within the range [−2,147,483,648..2,147,483,647]

---

## Example

### Input

[3, 4, 3, 2, 3, -1, 3, 3]

### Output

7

### Explanation

The value 3 appears 5 times, which is more than half of 8.
Valid outputs include any of the indices: 0, 2, 4, 6 or 7.

---

## Notes

* A standard approach is the **Boyer–Moore majority vote algorithm**:
  * First pass selects a **candidate** by canceling out different values.
  * Second pass counts occurrences to **validate** that it appears more than N/2 times.
* Returning any valid index is acceptable.
* Time complexity: **O(N)**
* Space complexity: **O(1)**
* Example tests shown are illustrative; Codility evaluates the solution using hidden test cases.
