# ➕ Add Binary Strings

---

## 📌 Problem Statement

Given two binary strings `a` and `b`, return their **sum as a binary string**.

This problem simulates the process of binary addition — similar to how we do addition by hand, but digit-by-digit from **right to left**, with a **carry**.

---

## 🧠 Understanding Binary Addition

Binary addition follows these rules:

| A | B | Carry In | Sum | Carry Out |
|---|---|----------|-----|-----------|
| 0 | 0 | 0        | 0   | 0         |
| 0 | 1 | 0        | 1   | 0         |
| 1 | 0 | 0        | 1   | 0         |
| 1 | 1 | 0        | 0   | 1         |
| 1 | 1 | 1        | 1   | 1         |
| 1 | 0 | 1        | 0   | 1         |
| 0 | 1 | 1        | 0   | 1         |

The idea is to simulate this table in code by processing both strings from **right to left**, adding digits and the carry at each step.

---

## 🔁 Algorithm Logic

1. Initialize two pointers `i` and `j` at the end of the strings `a` and `b`.
2. Initialize `carry = 0` and empty result string `sum = ""`.
3. Repeat the following until both strings are processed and `carry` becomes 0:
   - Get digit from `a[i]` or use 0 if `i < 0`
   - Get digit from `b[j]` or use 0 if `j < 0`
   - Compute total: `digitA + digitB + carry`
   - Append `total % 2` to the result string (this is the current binary digit)
   - Update carry: `carry = total / 2`
   - Decrement `i` and `j`

---

## 🧪 Example

### Input:

a = "1011"
b = "1101"



We add from right to left:

1 + 1 = 0 (carry 1)
1 + 0 + 1 = 0 (carry 1)
0 + 1 + 1 = 0 (carry 1)
1 + 1 + 1 = 1 (carry 1)
Extra carry = 1 → added to the front


### Output:

"11000"



---

## 🕰️ Time and Space Complexity

| Metric            | Value        |
|-------------------|--------------|
| Time Complexity   | O(max(n, m)) |
| Space Complexity  | O(max(n, m)) |

Where `n` and `m` are the lengths of input strings `a` and `b`.
