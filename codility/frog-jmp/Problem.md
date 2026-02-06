# Frog Jmp

## Problem

A small frog wants to cross the road by jumping from position **X** to a position **greater than or equal to Y**.
The frog always jumps a **fixed distance D**.

Your task is to compute the **minimum number of jumps** required for the frog to reach its destination.

The frog starts at position **X** and after each jump its position increases by exactly **D**.

---

## Function Signature

```java
class Solution { public int solution(int X, int Y, int D); }
```

---

## Input

* **X**: initial position of the frog
* **Y**: target position (destination)
* **D**: fixed jump distance

All inputs are integers.

---

## Output

* Returns an integer representing the **minimum number of jumps** required to reach a position **greater than or equal to Y**.

---

## Constraints

* `1 ≤ X ≤ Y ≤ 1,000,000,000`
* `1 ≤ D ≤ 1,000,000,000`

---

## Example

### Input

```
X = 10
Y = 85
D = 30
```

### Explanation

The frog jumps as follows:

* After 1st jump → position `40`
* After 2nd jump → position `70`
* After 3rd jump → position `100`

Since `100 ≥ 85`, the frog reaches the target in **3 jumps**.

### Output

```
3
```

---

## Notes

* If `X >= Y`, no jumps are required and the function should return `0`.
* The problem must be solved in **constant time O(1)**.
* Using loops to simulate jumps will lead to performance issues for large inputs.
* The solution relies on computing the **ceiling of an integer division**:
    ```
    ceil((Y - X) / D)
    ```
* In integer arithmetic, the ceiling can be computed safely as:
    ```
    (Y - X + D - 1) / D
    ```
* This approach avoids floating-point arithmetic and precision issues.
* Example tests shown are illustrative; Codility evaluates the solution using hidden test cases.
