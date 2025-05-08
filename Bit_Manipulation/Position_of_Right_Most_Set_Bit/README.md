# 📌 Position of the Rightmost Set Bit (RMSB)

## 📝 Problem Statement

Given a positive integer `n`, find the position (1-based index) of the **rightmost set bit** in its binary representation.

A *set bit* is a bit with the value `1`. If the number has no set bit (i.e., `n = 0`), return `0`.

---

## 🔍 Concept Overview

### 🔹 Binary Representation

Every integer has a binary representation. For example:
- `n = 18` → binary = `10010`

The **rightmost set bit** in `10010` is at position `2` (from the right, starting at 1).

---

## ✅ Approach 1: Bitwise Shifting

### Steps:
1. Start with a `mask = 1` (i.e., binary `0001`).
2. Check if `(n & mask) == 0`.
3. If true, left-shift the mask (`mask << 1`) and increment position.
4. Repeat until a set bit is found.

This method walks through each bit from right to left until the first `1` is encountered.

### Example:
**Input:** `n = 18`  
**Binary:** `10010`  
**RMSB Position:** `2`

**Time Complexity**:  
- Worst case: You might need to check all 32 bits for a 32-bit integer.
- **Time Complexity: O(log n)**  

---

## ✅ Approach 2: Mathematical Optimization (Efficient)

### Formula:
We isolate the rightmost set bit using:  

rmsb = n ^ (n & (n - 1)) 

This leaves only the rightmost set bit as `1`. Then we calculate its position using the binary logarithm:


### Explanation:
- `(n & (n - 1))` clears the rightmost set bit.
- XOR-ing it with `n` leaves only that bit set.
- `log2(x)` gives the position minus one, hence we add 1.

### Example:
**Input:** `n = 40`  
**Binary:** `101000`  
- `n & (n-1)` = `101000 & 100111` = `100000`  
- `rmsb = 101000 ^ 100000 = 001000`  
- `log2(8) + 1 = 3 + 1 = 4`

✅ **RMSB Position:** `4`

---

- **Time Complexity: O(1)**  
  (because all operations are fixed-time for 32- or 64-bit integers).

## ⚠️ Edge Case
If `n = 0`, no set bits exist → output is `0`.

---

## 🧠 Conclusion

Both approaches use bit manipulation:
- **First approach** scans bits from right to left.
- **Second approach** uses an optimized formula with logarithmic computation.