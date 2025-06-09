# 🔁 Bit Manipulation – Reverse Bits of an Integer Number

---

## 🧠 Bit Manipulation Logic

A 32-bit number has bits indexed from `0` (Least Significant Bit - LSB) to `31` (Most Significant Bit - MSB).

We want to **mirror** the bit values:

- Swap bit at index `i` with bit at index `31 - i`.

### 🔧 Core Logic

- Use two pointers: `f` (front = 31) and `l` (last = 0).
- For each pair `(f, l)`:
  - If the bit at position `f` in `n` is 1 → set bit `l` in `rev`.
  - If the bit at position `l` in `n` is 1 → set bit `f` in `rev`.
- Repeat until `f > l`.

---

| Operation             | Description                                      |
|-----------------------|--------------------------------------------------|
| `1 << i`              | Creates a mask to check/set the `i-th` bit       |
| `n & (1 << i)`        | Checks if the `i-th` bit is set in `n`           |
| `rev | (1 << j)`      | Sets the `j-th` bit in result `rev`              |

---

## 📘 Step-by-step Example

### Given:  
**n = 13**

Binary of 13: `00000000000000000000000000001101`

### Reversing Steps:

- Bit at index 0 (LSB) is `1`, becomes bit at index 31
- Bit at index 2 is `1`, becomes bit at index 29
- Bit at index 3 is `1`, becomes bit at index 28

### Resulting binary:  
`10110000000000000000000000000000`

= **2952790016 (Decimal)**

---

## 🧪 Example Table

| Input (n) | Binary (Original)            | Binary (Reversed)             | Output (Decimal) |
|-----------|------------------------------|-------------------------------|------------------|
| 1         | 00000000000000000000000000000001 | 10000000000000000000000000000000 | 2147483648       |
| 13        | 00000000000000000000000000001101 | 10110000000000000000000000000000 | 2952790016       |
| 8         | 00000000000000000000000000001000 | 00010000000000000000000000000000 | 268435456        |

---

## ⏱️ Time and Space Complexity

| Metric            | Value   |
|-------------------|---------|
| Time Complexity   | O(log n)    |
| Space Complexity  | O(1)    |


In this case Time complexity also can say O(1) because in terms of integer variable there is 32 bits. So in reversing it will be always 16 operations. That's why, We also can say that the program complete task in constant time so that we also can say O(log n).

