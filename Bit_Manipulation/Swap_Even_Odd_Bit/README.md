## 🔄 2. Swap Even and Odd Positioned Bits

### 📌 Problem Statement

Given a positive integer `n`, swap all **even-positioned** bits with **odd-positioned** bits in its binary representation.

---

### 🧠 Concept

We use **bitwise masks** and **shifts**:

- **Even-positioned bits**: Mask with `0xAAAAAAAA` (binary `101010...10`)
- **Odd-positioned bits**: Mask with `0x55555555` (binary `010101...01`)

Then:
- Right shift even bits by 1
- Left shift odd bits by 1
- Combine both with bitwise OR (`|`)

---

### 🔬 Bitwise Example

Suppose `n = 23` → Binary: `0001 0111`

| Bit Position (Index) | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
|----------------------|---|---|---|---|---|---|---|---|
| Value                | 0 | 0 | 0 | 1 | 0 | 1 | 1 | 1 |

---

### 🛠️ Step-by-Step Execution

1. **Odd Mask**: `0x55555555` = `010101...01`  
   Selects bits at positions 0, 2, 4, etc.

2. **Even Mask**: `0xAAAAAAAA` = `101010...10`  
   Selects bits at positions 1, 3, 5, etc.

3. **Bit Operations**:
Even Bits: (n & 0xAAAAAAAA) >>> 1
Odd Bits: (n & 0x55555555) << 1
Result = EvenBits | OddBits



4. **Final Result for n = 23** → `43`

---

### 📊 Masking Table

| Mask Type | Binary Pattern           | Hexadecimal      | Decimal         |
|-----------|---------------------------|------------------|-----------------|
| Even Mask | `101010...10`             | `0xAAAAAAAA`     | `-1431655766` *(32-bit signed)* |
| Odd Mask  | `010101...01`             | `0x55555555`     | `1431655765`    |

---

### ⏱️ Complexity

| Metric            | Value  |
|-------------------|--------|
| Time Complexity   | O(1)   |
| Space Complexity  | O(1)   |
