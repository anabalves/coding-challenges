# Count Bananas

## Problem
Given a string `S` consisting of uppercase English letters, in one move you may delete six letters that form the word **BANANA**
(1×`B`, 3×`A`, 2×`N`).

Your task is to compute the **maximum number of times** such a move can be applied.

## Function Signature

```java
class Solution { public int solution(String S); }
```

## Input

* `S`: a string of uppercase letters (`A`–`Z`).

## Output

* An integer representing the maximum number of `BANANA` words that can be formed.

## Constraints

* `1 ≤ N ≤ 100,000`
* `S` contains only uppercase English letters.

## Example

### Input

```
"NAABXXAN"
"NAANAAXNABABYNNBZ"
"QABAAWOB"
```

### Output

```
1
2
0
```

## Notes

* Each move consumes:

  * 1 × `B`
  * 3 × `A`
  * 2 × `N`
* The result is limited by the scarcest required letter.
* Time complexity: **O(N)**
* Space complexity: **O(1)**
