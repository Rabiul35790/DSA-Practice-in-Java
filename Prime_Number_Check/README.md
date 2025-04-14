# checking Prime Number in Different Approach

## 🔷 What is a Prime Number?

A **prime number** is a number **greater than 1** that is only divisible by **1** and **itself**.

**Examples:**
- **2** → Divisors: 1, 2 ✅ Prime  
- **5** → Divisors: 1, 5 ✅ Prime  
- **6** → Divisors: 1, 2, 3, 6 ❌ Not Prime (because 2 and 3 divide 6)

---

## ✅ **Approach 1: Normal Method (Check up to n/2)**

### 🔹 Idea:
To check if a number `n` is prime, we divide it by all numbers from `2` to `n/2`.

If any number divides `n` without a remainder, it's **not prime**.

### 🔹 Example:  
Check if `10` is prime:  
Try dividing 10 by numbers from 2 to 5 (since 10/2 = 5):  
- 10 % 2 = 0 → 2 divides 10 → ❌ Not prime

Check if `11` is prime:  
- 11 % 2 ≠ 0  
- 11 % 3 ≠ 0  
- 11 % 4 ≠ 0  
- 11 % 5 ≠ 0 → ✅ Prime

### 🔹 Time Complexity:  
O(n/2) → **Slow for big numbers**

---

## ✅ **Approach 2: Optimized Method (Check up to √n)**

### 🔹 Math Fact:
If a number is **not prime**, it must have a factor **less than or equal to its square root**.

So, instead of checking up to `n/2`, we only check up to **√n**.

### 🔹 Why?
If `n = a × b` and both `a` and `b` are greater than √n, then `a × b > n` – which is not possible.  
So, at least one factor must be ≤ √n.

### 🔹 Example:
Check if `29` is prime:  
√29 ≈ 5.38 → check divisibility from 2 to 5 only:
- 29 % 2 ≠ 0  
- 29 % 3 ≠ 0  
- 29 % 4 ≠ 0  
- 29 % 5 ≠ 0 → ✅ Prime

### 🔹 Time Complexity:
O(√n) → Much **faster** than checking up to n/2

---

## ✅ **Approach 3: Most Efficient Method (Skip multiples of 2 and 3, check in steps of 6)**

### 🔹 Extra Optimizations:
1. Eliminate obvious non-primes:
   - If n = 1 → ❌ Not prime  
   - If n = 2 or 3 → ✅ Prime  
   - If divisible by 2 or 3 → ❌ Not prime

2. Check from `i = 5` to `√n`, but only `i` and `i+2`:
   - Why? All prime numbers > 3 can be written as `6k ± 1` (like 5, 7, 11, 13, 17…)

So, we check divisibility by:
- 5 or 7  
- 11 or 13  
- 17 or 19, etc.

This skips checking even numbers and multiples of 3.

### 🔹 Example:
Check if `97` is prime:  
- 97 is not divisible by 2 or 3  
- √97 ≈ 9.84 → Check 5, 7  
  - 97 % 5 ≠ 0  
  - 97 % 7 ≠ 0 → ✅ Prime

### 🔹 Time Complexity:
O(√n) → but even **faster in practice** because fewer numbers are checked.

---

## 🔁 Conmarison of Time Complexity:

| Method                   | Check Range           | Time Complexity           | Efficient?                  |
|--------------------------|-----------------------|---------------------------|-----------------------------|
| Normal (n/2)             | 2 to n/2              | O(n)                      | ❌ Slow                     |
| Square Root (√n)         | 2 to √n               | O(√n)                     | ✅ Good                     |
| Most Efficient (6k ± 1)  | 5 to √n, step 6       | O(√n) (fewer checks)      | ✅✅ Best for large n        |
