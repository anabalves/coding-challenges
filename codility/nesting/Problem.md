# Nesting

## Problem

Determine whether a given string of parentheses (single type) is **properly nested**.

A string **S** consisting of *N* characters is called properly nested if:

* **S** is empty;
* **S** has the form `"(U)"` where **U** is a properly nested string;
* **S** has the form `"VW"` where **V** and **W** are properly nested strings.

For example:

* `"(()(())())"` is properly nested
* `"())"` is **not** properly nested

---

## Function Signature

```java
class Solution { public int solution(String S); }
```

---

## Input

* **S**: a string consisting only of characters `'('` and `')'`.

---

## Output

* Returns **1** if the string is properly nested.
* Returns **0** otherwise.

---

## Constraints

* `0 ≤ N ≤ 1,000,000`
* String **S** contains only `'('` and `')'`

---

## Example

### Input

```
"(()(())())"
```

### Output

```
1
```

### Input

```
"())"
```

### Output

```
0
```

---

## Notes

* An **empty string** is considered properly nested.
* A string becomes invalid immediately if, at any point, a closing parenthesis `')'` appears **before** a matching opening `'('`.
* Having the same total number of `'('` and `')'` is **not sufficient** — the order matters.
* The solution uses a **counter-based approach**, avoiding stack allocation for better performance.
* The algorithm performs **early termination** as soon as an invalid prefix is detected.
* Time complexity: **O(N)**
* Space complexity: **O(1)**
* Example tests shown by Codility are **not part of the final score**; additional hidden tests are used during evaluation.
