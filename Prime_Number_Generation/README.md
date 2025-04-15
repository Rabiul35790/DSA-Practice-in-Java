# 🧮 Prime Number Generation in Java

This repository demonstrates various approaches to generate prime numbers efficiently using Java. Each method highlights a different optimization level, combining algorithmic theory and mathematical insight.

---

## 📌 Implemented Approaches

### 1. 🔹 Brute Force Method

**Process:**
- Iterate from 2 to `n`.
- For each number `i`, check if it is divisible by any number from 2 to √i.
- Use the 6k ± 1 rule to skip unnecessary checks (as all primes > 3 are of the form 6k ± 1).

**Optimizations:**
- Avoids even numbers after 2.
- Skips checking multiples of 2 and 3.
- Starts checking from 5 and steps by 6: i.e., `i` and `i + 2`.

**Time Complexity:** O(n√n)  
**Space Complexity:** O(1)

---

### 2. 🔹 Sieve of Eratosthenes – First Version

**Process:**
- Create a boolean array `prime[0…n]` initialized to `false`.
- For every number `i` from 2 to `n`:
  - If `prime[i] == false`, mark all its multiples (2i, 3i, ...) as `true` (not prime).
- Print all indices where `prime[i] == false`.

**Optimizations:**
- Avoids checking each number individually.
- Eliminates numbers in a single pass for each base `i`.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)

---

### 3. 🔹 Optimized Sieve – Start from i²

**Process:**
- Same as the basic sieve but starts inner loop from `i²` instead of `2i`.
- For every `i`, mark all multiples starting from `i * i` as non-prime.

**Why i²?**
- All smaller multiples of `i` (like 2i, 3i, …, (i-1)i) are already marked by smaller primes.

**Optimizations:**
- Avoids redundant operations in the marking phase.

**Time Complexity:** O(n log log n)  
**Space Complexity:** O(n)

---

### 4. 🔹 Final Optimized Sieve – Outer Loop Up to √n

**Process:**
- Same as the previous optimized sieve, but the outer loop runs only while `i * i <= n`.
- Since any non-prime number greater than √n will already be marked by its smaller prime factors.

**Optimizations:**
- Reduces the outer loop iterations from `n` to √n.
- Most efficient version of Sieve of Eratosthenes.

**Time Complexity:** O(n log log n)  
**Space Complexity:** O(n)

---

## 📊 Comparative Summary

| Method                  | Time Complexity   | Space Complexity | Key Optimization                         |
|-------------------------|-------------------|------------------|------------------------------------------|
| Brute Force             | O(n√n)            | O(1)             | Skips even numbers & uses 6k ± 1         |
| Basic Sieve             | O(n log n)        | O(n)             | Marks multiples from 2i                  |
| Optimized Sieve (i²)    | O(n log log n)    | O(n)             | Starts marking from i²                   |
| Final Optimized Sieve   | O(n log log n)    | O(n)             | Outer loop only up to √n                 |

---

## 🧠 Mathematical Concepts Used

- **Prime Definition:** A number greater than 1 with no positive divisors other than 1 and itself.
- **Trial Division:** Efficient up to √n due to symmetry in multiplication.
- **6k ± 1 Rule:** All primes > 3 are of the form 6k ± 1.
- **Sieve Theory:** Efficiently removes multiples using prime steps, starting from i² for optimality.
