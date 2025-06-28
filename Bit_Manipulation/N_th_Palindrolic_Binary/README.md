# 🔢 N-th Palindromic Binary Number (Bit Manipulation)

---

## 📌 Problem Statement

Given a positive integer `n`, return the **n-th palindromic binary number** in decimal form.

---

## 💡 What is a Palindromic Binary?

A **palindromic binary number** is a number whose binary representation is the same when reversed.

### 🧾 Examples:

| Decimal | Binary  | Palindromic? |
|---------|---------|--------------|
| 1       | `1`     | ✅ Yes       |
| 3       | `11`    | ✅ Yes       |
| 5       | `101`   | ✅ Yes       |
| 9       | `1001`  | ✅ Yes       |
| 10      | `1010`  | ❌ No        |

---

## 🎯 Objective

Return the decimal representation of the **n-th palindromic binary number**, assuming `n` is 1-indexed.

---

## 🧠 Bitwise + Mathematical Strategy

We generate palindromic binary numbers **by length**, and for each length, we count how many palindromes exist.

### ✅ Number of palindromic binaries of a given length `l`:
- Let `l` be the length of the binary number.
- Total count of palindromic binaries of length `l` is:  
  `2^((l - 1) / 2)`

This is because only the **first half** of the binary needs to be chosen, and the second half is just a mirror.

---

### 🧮 Example: Build for n = 9

1. Start generating palindromes in increasing binary lengths:
   - Length 1 → 1 value → `1`
   - Length 2 → 1 value → `11`
   - Length 3 → 2 values → `101`, `111`
   - Length 4 → 2 values → `1001`, `1111`
   - Length 5 → 4 values → `10001`, `10101`, `11011`, `11111`

2. Total count of palindromes of length ≤ 5 = **9**

So, the **9th palindromic binary** is the last 5-bit palindrome: `11111` (Decimal = 31)

---

## 🔄 Step-by-Step Breakdown

Let’s say we want to find `n`-th palindromic binary number.

### Step 1: Determine the length `l` such that the `n-th` binary lies within palindromes of that length.
Accumulate total counts:

length 1 → 2^0 = 1
length 2 → 2^0 = 1
length 3 → 2^1 = 2
length 4 → 2^1 = 2
length 5 → 2^2 = 4
... until total ≥ n




### Step 2: Subtract previous counts to locate the `element` within that length group.

### Step 3: Construct the binary:
- Start with `1` at the MSB to ensure it’s of length `l`
- Insert the element bits in the first half
- Mirror the first half to form a full palindrome

---

## 🔍 Visualization Example

Let’s compute the **6th** palindromic binary number:

| Length | Count | Cumulative |
|--------|-------|------------|
| 1      | 1     | 1          |
| 2      | 1     | 2          |
| 3      | 2     | 4          |
| 4      | 2     | 6 ✅       |

→ We are in length `4` group → Total = 6, Previous = 4 → `element = n - 4 - 1 = 1`

So we want the **2nd palindromic binary of length 4**:

- First bit: `1`
- Middle bits (from `element = 1 = 01`): `10`
- Mirror → `1001`

✅ Result: **`1001`** = **9 (decimal)**

---

## ⏱️ Complexity Analysis

| Type              | Complexity |
|-------------------|------------|
| Time Complexity   | O(log n)   |
| Space Complexity  | O(1)       |

> Logarithmic because we're building palindromic binaries based on binary length (`log₂(n)` levels)

