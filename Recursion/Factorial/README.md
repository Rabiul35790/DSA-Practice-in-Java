# 📘 Recursive Factorial Calculation

---

## 📌 Problem Statement

Given a positive integer `n`, find the **factorial** of `n`.

The factorial of a number `n` is the product of all positive integers less than or equal to `n`.

---

## 🧮 Definition of Factorial

Factorial is defined as:

n! = n × (n - 1) × (n - 2) × ... × 2 × 1



### ✅ Example Calculations

| Input `n` | Output `n!` | Explanation                  |
|-----------|-------------|------------------------------|
| 1         | 1           | 1                            |
| 3         | 6           | 3 × 2 × 1                    |
| 5         | 120         | 5 × 4 × 3 × 2 × 1            |
| 6         | 720         | 6 × 5 × 4 × 3 × 2 × 1        |

---

## 🔁 Approach: Recursion

This implementation uses the **recursive definition** of factorial:

fact(n) = n × fact(n - 1)
fact(1) = 1 (base case)



This recursive process continues until `n` reaches 1.

---

## 🧠 How It Works (Step-by-Step for n = 4)

1. Call `fact(4)`
2. Calls `4 × fact(3)`
3. Calls `3 × fact(2)`
4. Calls `2 × fact(1)`
5. Base case → returns 1

Then all return values are multiplied backward:

fact(2) = 2 × 1 = 2
fact(3) = 3 × 2 = 6
fact(4) = 4 × 6 = 24



---

## 🧩 Edge Case

If `n = 1`, the function directly returns 1.  
(You can also define `0! = 1` mathematically, though it's not used here.)

---

## ⏱️ Time and Space Complexity

| Metric            | Value        |
|-------------------|--------------|
| Time Complexity   | O(n)         |
| Space Complexity  | O(n)         |

- Time grows linearly with `n` because we perform `n` recursive calls.
- Space is also linear due to the recursion call stack.
