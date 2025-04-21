# 📘 Prime Factorization of a Number

A **prime factor** of a number is a prime number that divides the number exactly, without leaving a remainder.

Example:  
For `n = 60`, the prime factors are:  
**2, 2, 3, 5** (since 2 × 2 × 3 × 5 = 60)

---

## 1️⃣ Worst Case O(n) Approach

### Concept:
Check every number from `2` to `n`. For each `i`, keep dividing `n` as long as it is divisible by `i`.

### Steps:
1. Input a number `n`
2. Start from `i = 2` and repeat while `n > 1`
3. While `n % i == 0`, print `i` and divide `n` by `i`
4. Increment `i`

### Example for `n = 60`:
Output:  
**2, 2, 3, 5**

### When it is bad:
For large prime numbers like `n = 9973`, it checks every number from `2` to `9972` before reaching the prime itself. This makes it very slow in such cases.

---

## 2️⃣ Always O(√n) Approach

### Concept:
Only check up to √n for potential factors. If any number greater than √n remains, it must be a prime factor.

### Steps:
1. Input a number `n`
2. Loop with `i` from 2 to √n
3. While `n % i == 0`, print `i` and divide `n` by `i`
4. After the loop, if `n > 1`, print `n`

### Example for `n = 60`:
Output:  
**2, 2, 3, 5**

---

## Comparison Table

| Method               | Time Complexity | Output Order | Note                          |
|----------------------|-----------------|--------------|-------------------------------|
| Worst Case O(n)      | O(n)            | Ordered      | Slow for large prime numbers  |
| Always O(√n)         | O(√n)           | Ordered      | Efficient in all cases        |
