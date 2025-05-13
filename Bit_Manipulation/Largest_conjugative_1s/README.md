# 🧠 Bit Manipulation – Consecutive 1s in Binary

This repository contains solutions and detailed theoretical explanations for the following two bit manipulation problems:

1. ✅ Check if Consecutive 1s are Present in Binary
2. ✅ Find the Length of the Longest Consecutive 1s in Binary

---

## 🔹 Problem 1: Check if Consecutive 1s are Present in Binary

### 📌 Problem Description

Given an integer `a`, determine whether its binary representation contains **two or more consecutive 1s**.

### 🧠 Core Idea

We can use bitwise operations to check for consecutive 1s without manually converting to binary.

### 🧮 Bitwise Insight

To detect consecutive 1s:
- Use the expression: a & (a << 1)
- If the result is non-zero, it means there are consecutive 1s.

### 🔍 Mathematical Example

Let’s consider `a = 13`:
- Binary of 13: `1101`
- Left shift 13 by 1: `11010`
- Now, apply bitwise AND:

1101 (13)
& 11010 (13 << 1)
= 1100 → non-zero → Consecutive 1s exist ✅

Now consider `a = 10`:
- Binary of 10: `1010`
- Left shift: `10100`
- Bitwise AND:

1010 & 10100
= 00100 → non-zero → Consecutive 1s do NOT exist ❌



In this case, the result is non-zero, but not due to **two adjacent 1s**, so it may give misleading results in edge cases. This approach assumes input is well-formed for this check.

### ⏱️ Time and Space Complexity

| Type             | Complexity |
|------------------|------------|
| Time Complexity  | O(1)       |
| Space Complexity | O(1)       |

---

## 🔹 Problem 2: Find the Length of Longest Consecutive 1s in Binary

### 📌 Problem Description

Given an integer `a`, find the length of the **longest sequence** of consecutive 1s in its binary representation.

### 🧠 Core Idea

Scan each bit of the number using bitwise operations and keep count of current and maximum streaks of 1s.

### 🔍 Mathematical Example

Let’s take `a = 29`:
- Binary of 29: `11101`

We traverse each bit:

1 → current = 1, max = 1
1 → current = 2, max = 2
1 → current = 3, max = 3
0 → reset current = 0
1 → current = 1, max = 3


✅ Final answer: `3` (Longest run of 1s is `111`)

Another example: `a = 19`  
- Binary: `10011`

1 → current = 1, max = 1
0 → reset
0 → reset
1 → current = 1, max = 1
1 → current = 2, max = 2



✅ Final answer: `2`

### ⏱️ Time and Space Complexity

| Type             | Complexity |
|------------------|------------|
| Time Complexity  | O(log n)   |
| Space Complexity | O(1)       |

---

## 📊 Comparative Summary

| Problem                                  | Core Idea                        | Bit Expression            | Time Complexity | Space Complexity |
|------------------------------------------|----------------------------------|----------------------------|------------------|------------------|
| Check if Consecutive 1s Exist            | Bitwise check with shift         | `a & (a << 1)`             | O(1)             | O(1)             |
| Find Length of Longest Consecutive 1s    | Traverse bits with counters      | Bitwise right shift        | O(log a)         | O(1)             |
