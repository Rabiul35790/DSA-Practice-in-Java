# Bit Manipulation: Toggle the ith Bit

## 🔧 Problem Statement

Given an integer `n` and an index `i`, the task is to **toggle** (invert) the `i-th` bit of the number `n`.  
The bit positions are considered 0-indexed from the right.

This means:
- If the bit is 1 → change it to 0.
- If the bit is 0 → change it to 1.

---

## 📌 Concept Overview

### 🔹 Binary Representation

Every integer is internally represented in binary (base-2).  
Each bit is either 0 or 1 and corresponds to a power of 2.

For example:  
`n = 10` in binary is `00001010`.

### 🔹 Goal

We want to **flip** the bit at a specific position `i`.  
All other bits must remain unchanged.

---

## 🧠 Mathematical Logic

To toggle a specific bit, we use the **bitwise XOR ( ^ )** operator.

### Steps:

1. **Create a Mask**  
   Use `1 << i` to create a binary number with only the `i-th` bit set to 1.  
   Example: For `i = 2`, the mask is `00000100` (decimal 4).

2. **Apply XOR Operation**  
   XOR flips the bit at the `i-th` position:  
   - `1 ^ 1 = 0`  
   - `0 ^ 1 = 1`  
   So, `n ^ mask` toggles only the desired bit.

---

## 📊 Example

### Example 1:
**Input:**  
n = 10 (binary: `00001010`)  
i = 1

**Mask:**  
`1 << 1` → `00000010`

**Toggle:**  
00001010 (10) ^ 00000010 (2)
= 00001000 (8)


So, the result is `8`.

---

### Example 2:
**Input:**  
n = 10 (binary: `00001010`)  
i = 3

**Mask:**  
`1 << 3` → `00001000`

**Toggle:**  
00001010 (10) ^ 00001000 (8)
= 00000010 (2)


So, the result is `2`.

---

## ✅ Conclusion

Toggling a specific bit is a powerful operation in low-level and systems programming.  
Using the XOR operator with a left-shifted bit mask provides a fast and efficient way to invert a single bit in a binary number while leaving the others unchanged.

This technique is commonly used in:
- Switch operations
- Flag control systems
- Optimization problems in competitive programming
