# 📘 Print All Divisors of a Number in Java

A **divisor** of a number is any number that divides it exactly, without leaving a remainder.

Example:  
For `n = 36`, the divisors are:  
**1, 2, 3, 4, 6, 9, 12, 18, 36**

---

## 1️⃣ Brute Force Approach

### Concept:
Check every number from `1` to `n` and print it if it divides `n`.

### Steps:
1. Input a number `n`
2. Loop from `1` to `n`
3. If `n % i == 0`, print `i`

### Example for `n = 36`:  
Check all values from `1` to `36`  
Output:  
`1, 2, 3, 4, 6, 9, 12, 18, 36`

---

## 2️⃣ Square Root (√n) Approach (Unordered)

### Concept:
For each divisor less than or equal to √n, there exists a corresponding pair `n / i`.

### Steps:
1. Input a number `n`
2. Loop from `1` to `√n`
3. If `n % i == 0`, print `i` and `n / i` (if they are different)

### Example for `n = 36`:  
Loop till `6`  
Divisor pairs: `(1, 36)`, `(2, 18)`, `(3, 12)`, `(4, 9)`, `6`  
Output (unordered):  
`1, 36, 2, 18, 3, 12, 4, 9, 6`

---

## 3️⃣ Square Root (√n) Approach with Ascending Order

### Concept:
Print smaller divisors first, then print larger ones in reverse order.

### Steps:
1. Input a number `n`
2. Loop from `1` to `√n`, print `i` if `n % i == 0`
3. Loop from `√n` down to `1`, print `n / i` if `n % i == 0` and `i != n / i`

### Example for `n = 36`:  
First part: `1, 2, 3, 4, 6`  
Second part: `9, 12, 18, 36`  
Output (ascending):  
`1, 2, 3, 4, 6, 9, 12, 18, 36`

---

## Comparison Table

| Method                       | Time Complexity | Output Order |
|-----------------------------|-----------------|--------------|
| Brute Force                 | O(n)            | Ordered      |
| Square Root (Unordered)     | O(√n)           | Unordered    |
| Square Root (Ascending)     | O(√n)           | Ordered      |
