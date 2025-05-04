# Bit Manipulation: Flip the ith Bit

## 🔧 Problem Statement

Given an integer `n` and an index `i`, your task is to **set** (turn ON) the `i-th` bit of the number `n`. The bit positions are 0-indexed from the right.

This is a classic bit manipulation problem where the goal is to modify a specific bit of a binary number using bitwise operations.

---

## 📌 Concept Overview

### 🔹 Bit Representation

Every integer is stored in binary. Each bit represents a power of 2.

For example:  
If `n = 10`, its binary form is `00001010`.

### 🔹 The Goal

You are given a number `n` and a position `i`.  
You need to **set the bit at position `i` to 1**, regardless of whether it is 0 or already 1.

This means:
- If the bit at index `i` is already 1 → keep it as 1.
- If the bit at index `i` is 0 → change it to 1.

---

## 🧠 Mathematical Approach

To perform this operation, we use the **bitwise OR (|)** operator.

### Step-by-step:

1. **Create a mask**  
   Use `1 << i` to create a number where only the `i-th` bit is set.  
   Example: For `i = 2`, the mask becomes `00000100` (which is 4).

2. **Apply the OR operation**  
   `n | mask` will ensure the `i-th` bit of `n` becomes 1.

This approach preserves all other bits and only ensures the desired bit is set.

---

## 📊 Example

**Input:**  
n = 10 (binary: 00001010)  
i = 1

**Process:**  
- Create mask = 1 << 1 = 2 (binary: 00000010)  
- Apply OR:  
  `00001010`  
| `00000010`  
= `00001010` → Result: 10 (bit already on)

**Another Input:**  
n = 10  
i = 2

**Mask:** 1 << 2 = 4 (binary: 00000100)  
OR Operation:  
`00001010`  
| `00000100`  
= `00001110` → Result: 14 (bit flipped from 0 to 1)

---

## ✅ Conclusion

This problem demonstrates a fundamental concept in bit manipulation.  
By using the bitwise OR operation with a left-shifted mask, we can ensure any specific bit is **set** to 1 without changing the rest of the number.
