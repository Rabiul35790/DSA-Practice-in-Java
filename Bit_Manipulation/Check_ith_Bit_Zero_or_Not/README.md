# Bit Manipulation: Check if the ith Bit is ON or OFF

## 🔧 Problem Statement

Given an integer `n` and an index `i`, the goal is to determine whether the bit at position `i` (0-indexed from the right) is **ON (1)** or **OFF (0)** in the binary representation of `n`.

---

## 📌 Concept Overview

### 🔹 Binary Representation

Each integer can be represented in binary, where each bit corresponds to a power of 2.

For instance:  
n = 10 → binary = `00001010`

### 🔹 Objective

We want to check the **status of the i-th bit**:
- If it's `1`, we say the bit is **ON**.
- If it's `0`, we say the bit is **OFF**.

---

## 🧠 Mathematical Logic

We use the **bitwise AND ( & )** operation to check a bit.

### Steps:

1. **Create a Mask**  
   Compute `1 << i` — this sets only the i-th bit to 1.  
   Example: If `i = 3`, then mask = `00001000`.

2. **Apply AND Operation**  
   Perform: `n & mask`.  
   - If the result is 0 → the i-th bit is OFF.  
   - If the result is non-zero → the i-th bit is ON.

---

## 📊 Examples

### Example 1:
**Input:**  
n = 10 (binary: `00001010`), i = 1

**Mask:**  
`1 << 1` → `00000010`

**Check:**  
00001010 (n = 10) & 00000010 (mask) = 00000010 → ON (since result ≠ 0)


### Example 2:
**Input:**  
n = 10 (binary: `00001010`), i = 0

**Mask:**  
`1 << 0` → `00000001`

**Check:**  
00001010 (n = 10) & 00000001 (mask) = 00000000 → OFF (since result = 0)


---

## ✅ Conclusion

By using a bitmask and AND operation, we can efficiently determine the state of any specific bit in constant time.
