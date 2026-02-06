# Flood Depth

## Problem

After a heavy rainfall, water fills all low-lying areas of a mountainous landscape.
The landscape is represented by an array `A`, where each element indicates the altitude
of the rock floor at that position.

Water is trapped in positions that have higher blocks on both sides.  
Your task is to compute the **maximum depth of water** that can be formed after the
entire area is flooded.

The depth at a position is defined as the difference between the water level and the
rock floor at that point.

## Function Signature

```java
class Solution { public int solution(int[] A); }
```

## Input

- `A`: a non-empty array of integers representing block altitudes.

## Output

- An integer representing the *maximum water depth*.
- Returns `0` if the landscape cannot hold water.

## Constraints

- `1 ≤ N ≤ 100,000`
- `1 ≤ A[i] ≤ 100,000,000`

## Example

### Input

```
[1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2]
```

Water depths at some positions:
- Depth `2` at blocks `3` and `5`
- Depth `1` at blocks `2`, `4`, `7` and `8`

### Output

```
2
```

## Notes

- The landscape outside the array is considered to have altitude 0.
- The solution must be efficient, as the input size can be large.
