# Brackets

## Problem

A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

* S is empty;
* S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
* S has the form "VW" where V and W are properly nested strings.

For example, the string "{[()()]}" is properly nested but "([)()]" is not.

The goal is to determine whether S is properly nested.

---

## Function Signature

```java
class Solution { public int solution(String S); }
```

---

## Input

* **S**: a string made only of the following characters: `'('`, `')'`, `'['`, `']'`, `'{'`, `'}'`.

---

## Output

* Returns **1** if S is properly nested.
* Returns **0** otherwise.

---

## Constraints

* 0 ≤ N ≤ 200,000
* S contains only: `(`, `)`, `[`, `]`, `{`, `}`

---

## Example

### Input

"{[()()]}"

### Output

1

### Explanation

All brackets are correctly opened and closed in the right order, so the string is properly nested.

---

## Notes

* The standard approach uses a **stack**:
  * Push opening brackets.
  * On a closing bracket, the top of the stack must be the matching opening bracket.
* If a closing bracket appears when the stack is empty, the string is invalid.
* At the end, the stack must be empty; otherwise there are unmatched opening brackets.
* Time complexity: **O(N)**
* Space complexity: **O(N)** in the worst case.
* Example tests shown by Codility are not part of the final score; hidden tests are used during evaluation.
