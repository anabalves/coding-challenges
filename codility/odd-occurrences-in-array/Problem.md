# Odd Occurrences in Array

## Problem

A non-empty array **A** consisting of **N integers** is given.
The array contains an **odd number of elements**, and every value occurs an **even number of times**, **except for exactly one element**, which is left unpaired.

Your task is to **find and return the value of the unpaired element**.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* `A`: a non-empty array of integers.
* The array contains an **odd number of elements**.
* All values except one occur an even number of times.

---

## Output

* An integer representing the **unpaired element**.

---

## Constraints

* `1 ≤ N ≤ 1,000,000`
* `N` is odd
* `1 ≤ A[i] ≤ 1,000,000,000`
* Exactly one value occurs an odd number of times

---

## Example

### Input

```
[9, 3, 9, 3, 9, 7, 9]
```

### Output

```
7
```

### Explanation

* Values `9` and `3` appear an even number of times.
* Value `7` appears only once and has no pair.

---

## Notes

* The problem can be solved efficiently using the **bitwise XOR (^) operation**.
* XOR properties:
  * `x ^ x = 0`
  * `x ^ 0 = x`
* All paired values cancel out, leaving only the unpaired element.
* Time complexity: **O(N)**
* Space complexity: **O(1)**
* The solution relies on the problem guarantee that exactly one element is unpaired.
