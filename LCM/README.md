# 📘 LCM Calculation in Java

This repository demonstrates two methods to calculate the **Least Common Multiple (LCM)** of two numbers in Java:

- ✅ Brute Force Approach
- ✅ Optimized Approach using GCD (Greatest Common Divisor)

---

## 📌 What is LCM?

The **Least Common Multiple (LCM)** of two integers *a* and *b* is the smallest positive integer that is exactly divisible by both *a* and *b*.

---

## 🔍 Approaches

### 1. Brute Force Approach

- Start from `max(a, b)` and check each successive integer.
- The first number divisible by both *a* and *b* is the LCM.

**Mathematical Idea:**
LCM(a, b) = min { x ∈ ℕ | x % a == 0 and x % b == 0 }

**⏱ Time Complexity:**  
`O(a × b)` (inefficient for large numbers)

---

### 2. Optimized Approach using GCD

- Use the relationship between GCD and LCM:

LCM(a, b) = (a × b) / GCD(a, b)

- First compute GCD using **Euclid’s Algorithm**.
- Then calculate the LCM using the formula above.

**⏱ Time Complexity:**  
- GCD: `O(log(min(a, b)))`  
- LCM: `O(1)`  
- ✅ Much more efficient and scalable

---

## ✅ Conclusion

| Method         | Efficiency         | Time Complexity   |
|----------------|--------------------|-------------------|
| Brute Force    | 🚫 Inefficient for large numbers | `O(a × b)` |
| GCD-based      | ✅ Preferred and fast | `O(log(min(a, b)))` |
