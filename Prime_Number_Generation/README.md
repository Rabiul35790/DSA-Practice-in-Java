# 🧮 Prime Number Generation

This repository provides multiple implementations for generating prime numbers using both brute-force and optimized algorithms. Each method is explained using mathematical reasoning and algorithmic complexity.

---

## 📌 Algorithms Overview

### 🔹 Brute Force Method

- **Concept:** Checks each number from 2 to `n` for primality by testing divisibility up to √n.
- **Optimization:** Skips even numbers and checks only values of the form 6k ± 1.
- **Time Complexity:** O(n√n)
- **Space Complexity:** O(1)

---

### 🔹 Sieve of Eratosthenes – Basic

- **Concept:** Uses a boolean array to mark multiples of every integer starting from 2 as non-prime.
- **Marking Starts From:** 2 × i
- **Time Complexity:** O(n log n)
- **Space Complexity:** O(n)

---

### 🔹 Sieve – Optimized (Start from i²)

- **Concept:** Improves the basic sieve by starting the marking of multiples from i² instead of 2i.
- **Mathematical Insight:** Multiples less than i² are already marked by smaller primes.
- **Time Complexity:** O(n log log n)
- **Space Complexity:** O(n)

---

### 🔹 Final Optimized Sieve (Outer Loop Up to √n)

- **Concept:** Limits the outer loop to i ≤ √n for additional optimization.
- **Mathematical Insight:** Multiples of i where i² > n are beyond the range.
- **Time Complexity:** O(n log log n)
- **Space Complexity:** O(n)

---

## 📊 Summary Table

| Method                  | Time Complexity   | Space Complexity | Description                            |
|-------------------------|-------------------|------------------|----------------------------------------|
| Brute Force             | O(n√n)            | O(1)             | Trial division up to √n                |
| Basic Sieve             | O(n log n)        | O(n)             | Marks all multiples from 2i            |
| Optimized Sieve (i²)    | O(n log log n)    | O(n)             | Starts marking from i²                 |
| Final Optimized Sieve   | O(n log log n)    | O(n)             | Outer loop up to √n                    |

---

## 🧠 Mathematical Concepts Used

- Primes are numbers > 1 with no positive divisors other than 1 and itself.
- Optimization using divisibility patterns like 6k ± 1.
- Efficient sieving reduces redundant operations by starting from i².
- Only iterations up to √n are needed for marking composite numbers.
