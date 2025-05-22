## 🔢 Count Number of Trailing Zeros in Binary

---

### 📌 Problem Statement

Given a positive integer `n`, find the number of **trailing zeros** in its **binary representation**. A trailing zero is a zero that comes after the **least significant bit** (rightmost bit) until the first 1 is encountered.

---

### 🧠 Key Concept

We can find the number of trailing zeros using the following bit manipulation trick:

1. **Find the rightmost set bit**:
   - `mask = n & (n - 1)` clears the rightmost set bit.
   - `num = n ^ mask` isolates only the rightmost set bit.

2. **Use logarithm base 2**:
   - Since `num` is a power of 2, taking `log₂(num)` gives the position of the rightmost set bit.
   - This position is equivalent to the **count of trailing zeros**.

---

### 📘 Mathematical Example

Let’s take `n = 40`.

- Binary of `n`: `101000`
- Trailing zeros: 3

#### Step-by-step:

n = 101000 (binary)
n-1 = 100111
n & n-1 = 100000
n ^ (n & (n-1)) = 001000 → Isolates rightmost set bit (value: 8)
log₂(8) = 3 → 3 trailing zeros


### 🔬 Example Table

| n (Decimal) | Binary     | Trailing Zeros |
|-------------|------------|----------------|
| 8           | 1000       | 3              |
| 40          | 101000     | 3              |
| 10          | 1010       | 1              |
| 4           | 100        | 2              |
| 3           | 11         | 0              |

---

### ⚠️ Why This Works?

Any power of two has a single set bit at a certain position. The number of trailing zeros corresponds exactly to the index of that bit.

By isolating the rightmost set bit and taking base-2 logarithm, but we can't do log2 in java directly so that the formula used which is 

"log10(num)/log10(2) = log2(num)"

---

### ⏱️ Time and Space Complexity

| Metric            | Value  |
|-------------------|--------|
| Time Complexity   | O(1)   |
| Space Complexity  | O(1)   |