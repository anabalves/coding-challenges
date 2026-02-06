# Days of the Week

## Problem
Days of the week are represented as three-letter strings:
`Mon`, `Tue`, `Wed`, `Thu`, `Fri`, `Sat`, `Sun`.

Given a starting day `S` and an integer `K`, return the day of the week that occurs `K` days later.

## Function Signature

```java
class Solution { public String solution(String S, int K); }
```

## Input

* `S`: a valid three-letter day of the week.
* `K`: number of days to advance.

## Output

* A three-letter string representing the resulting day.

## Constraints

* `0 ≤ K ≤ 500`
* `S` is always a valid day of the week.

## Example

### Input

```
("Wed", 2)
("Sat", 23)
("Sun", 500)
```

### Output

```
"Fri"
"Mon"
"Thu"
```

## Notes

* The problem is cyclical (7 days).
* The solution maps days to indices and applies modulo arithmetic.
* Time complexity: **O(1)**
* Space complexity: **O(1)**
