# Perm Missing Element

## Problem

An array `A` consisting of `N` different integers is given.
The array contains integers in the range **[1..(N + 1)]**, which means that **exactly one element is missing**.

Your task is to find the missing element in the permutation.

This is a classic problem that tests understanding of **arithmetic sequences**, **edge cases**, and **overflow-safe implementations**.

---

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

---

## Input

* `A`: an array of `N` distinct integers
* Values are in the range `[1..(N + 1)]`

---

## Output

* An integer representing the **missing element** in the permutation.

---

## Constraints

* `0 ≤ N ≤ 100,000`
* All elements in `A` are distinct
* Each element of `A` is in the range `[1..(N + 1)]`

---

## Example

### Input

```
[2, 3, 1, 5]
```

### Output

```
4
```

### Explanation

The full permutation should contain all values from `1` to `5`.
The value `4` is missing, so the function returns `4`.

---

## Notes

* The expected solution runs in **O(N)** time complexity.
* The algorithm uses **constant extra space (O(1))**.
* A common and efficient approach is to:
  * Compute the expected sum of numbers from `1` to `N+1`
  * Subtract the actual sum of elements in the array
* The implementation should use `long` internally to **avoid integer overflow** for large inputs.
* Edge cases such as an empty array (`N = 0`) must be handled correctly.
