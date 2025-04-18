# 📘 Print All Divisors of a Number in Java

A **divisor** of a number is any number that divides it exactly, without leaving a remainder.

### 🔢 Example
For example, for the number `36`, the divisors are:  
`1, 2, 3, 4, 6, 9, 12, 18, 36`

---

## 1️⃣ Brute Force Approach

### 💡 Idea:
Check every number from `1` to `n` and print the ones that divide `n`.

### 🔄 Steps:
1. Input the number `n`
2. Start from `i = 1` to `n`
3. If `n % i == 0`, then `i` is a divisor

### 📌 Example:
For `n = 36`, check:  
`1 % 36 == 0 ✅`  
`2 % 36 == 0 ✅`  
...  
`36 % 36 == 0 ✅`  
All divisors printed in increasing order.

### ⏱️ Time Complexity: O(n)

---

## 2️⃣ Root-n (√n) Approach (Unordered)

### 💡 Idea:
Every divisor `i` has a corresponding pair `n/i`. So we only loop till `√n`, and for each valid `i`, print both `i` and `n/i`.

### 🔄 Steps:
1. Input the number `n`
2. Loop `i` from `1` to `√n`
3. If `n % i == 0`, print `i` and `n/i` (if they are different)

### 📌 Example:
For `n = 36`  
From `i = 1` to `6`:  
- `1` and `36`  
- `2` and `18`  
- `3` and `12`  
- `4` and `9`  
- `6` (only once if `i == n/i`)

Divisors may appear in mixed order like:  
`1, 36, 2, 18, 3, 12, 4, 9, 6`

### ⏱️ Time Complexity: O(√n)

---

## 3️⃣ Root-n (√n) Approach with Ascending Order

### 💡 Idea:
Same as above, but stores smaller and larger divisors separately and prints them in order.

### 🔄 Steps:
1. Input the number `n`
2. Loop `i` from `1` to `√n`
   - If `n % i == 0`, print `i`
3. Loop `i` from `√n` down to `1`
   - If `n % i == 0` and `i != n/i`, print `n/i`

### 📌 Example:
For `n = 36`  
First loop: prints `1, 2, 3, 4, 6`  
Second loop: prints `9, 12, 18, 36`  
Final result (in ascending order):  
`1, 2, 3, 4, 6, 9, 12, 18, 36`

### ⏱️ Time Complexity: O(√n)

---

## 📊 Comparison Table

| Approach                  | Time Complexity | Order     | Example Output (n = 36)          |
|---------------------------|-----------------|-----------|----------------------------------|
| Brute Force               | O(n)            | Ordered   | 1, 2, 3, ..., 36                 |
| Root-n (Unordered)        | O(√n)           | Unordered | 1, 36, 2, 18, 3, 12, ...         |
| Root-n (Ascending Order)  | O(√n)           | Ordered   | 1, 2, 3, 4, 6, 9, 12, 18, 36     |