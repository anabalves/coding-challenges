# Binary Gap

## Problem

A **binary gap** within a positive integer `N` is any maximal sequence of consecutive zeros that is **surrounded by ones at both ends** in the binary representation of `N`.

For example:

* Number `9` has binary representation `1001` and contains a binary gap of length `2`.
* Number `529` has binary representation `1000010001` and contains two binary gaps of lengths `4` and `3`.
* Number `20` has binary representation `10100` and contains one binary gap of length `1`.
* Number `15` has binary representation `1111` and has no binary gaps.
* Number `32` has binary representation `100000` and has no binary gaps.

The goal is to compute the **length of the longest binary gap**.

---

## Function Signature

```java
class Solution { public int solution(int N); }
```

---

## Input

* `N`: a positive integer.

---

## Output

* An integer representing the **length of the longest binary gap**.
* Returns `0` if the integer does not contain a binary gap.

---

## Constraints

* `1 ≤ N ≤ 2,147,483,647`
* `N` fits in a 32-bit signed integer.

---

## Example

### Input

```
1041
```

### Output

```
5
```

### Explanation

The binary representation of `1041` is `10000010001`.
The longest sequence of consecutive zeros surrounded by ones has length `5`.

---

## Notes

* Zeros at the **end** of the binary representation are not considered a binary gap, as they are not closed by a `1`.
* The solution uses **bitwise operations**, avoiding string conversion for better performance.
* The expected time complexity is **O(1)**, since the number of bits in an integer is constant.
* This problem is commonly used to evaluate understanding of **binary representation**, **bit manipulation**, and **edge-case handling**.
