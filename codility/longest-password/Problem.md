# Longest Password

## Problem

You would like to set a password for a bank account. However, there are three restrictions:

- It has to contain only alphanumerical characters (`a-z`, `A-Z`, `0-9`);
- There should be an even number of letters;
- There should be an odd number of digits.

Given a non-empty string `S`, split it by spaces into words and return the length of the longest word that is a valid password.
If there is no valid password, return `-1`.

## Function Signature

```java
class Solution { public int solution(String S); }
```

## Example

### Input Format

```
test 5 a0A pass007 ?xy1
```

Valid passwords: `5`, `a0A`, `pass007`
Output: `7`

### Constraints

- `1 <= N <= 200`
- `S` contains printable ASCII characters and spaces

## Notes

- A valid password must be strictly alphanumeric.
- Example tests are not part of the final score (Codility uses hidden tests).