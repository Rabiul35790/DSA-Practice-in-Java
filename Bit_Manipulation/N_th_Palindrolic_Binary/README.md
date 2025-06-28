# 🔁 N-th Palindromic Binary Number

## 📌 Problem Statement

Given a positive integer `n`, return the **n-th palindromic binary number** in **decimal form**.  
The binary number is considered palindromic if it reads the same forwards and backwards.

---

## 📘 What is a Palindromic Binary?

A palindromic binary number has the same binary digits when reversed.

### ✅ Examples

| Decimal | Binary  | Palindromic? |
|---------|---------|--------------|
| 1       | `1`     | ✅ Yes       |
| 3       | `11`    | ✅ Yes       |
| 5       | `101`   | ✅ Yes       |
| 9       | `1001`  | ✅ Yes       |
| 10      | `1010`  | ❌ No        |

---

## 🎯 Objective

Find and return the **decimal value** of the `n`-th palindromic binary number (1-indexed).

---

## 🧠 Concept & Strategy

To generate palindromic binary numbers, observe that:

- Palindromes of length `l` can be built by choosing only the **first half** of the bits.
- The second half is just a **mirror** of the first half.
- For odd-length binaries, the center bit is not mirrored but still included once.

### ✅ Count of palindromes by length:
For any binary length `l`, the count of palindromic binaries is:



count = 2^((l - 1) / 2)


---

## 🔧 Algorithm Steps

### 1. Determine the binary length `l` such that `n` falls in that group.

Cumulatively sum palindromic binary counts of increasing lengths until `n` fits.

### 2. Find the relative index (`element`) of `n` in that group:

element = n - total_count_before_length_l - 1




### 3. Build the first half:
Set the most significant bit to ensure correct length, then shift `element` into the middle bits:



### 4. Mirror the first half into the second half using bitwise operations:

- Swap bit at position `i` with bit at `l - 1 - i` if set.
- Use `&`, `|`, and `<<` to check/set bits.

### 5. Combine original and mirrored halves.

---

## 🔍 Step-by-Step Example

### Find the 6th palindromic binary number:

1. Count palindromes by length:

| Length | Count         | Cumulative |
|--------|---------------|------------|
| 1      | `2^0 = 1`     | 1          |
| 2      | `2^0 = 1`     | 2          |
| 3      | `2^1 = 2`     | 4          |
| 4      | `2^1 = 2` ✅  | 6          |

✅ We're in length 4 group, and it's the 2nd element in that group:

element = 6 - 4 - 1 = 1



2. Build the first half:


firstHalf = (1 << 3) | (1 << 1) = 1000 | 0010 = 1010




3. Mirror `1010` → `1001`

Final palindromic binary: `1001` → Decimal = **9**

---

## 🧮 Bitwise Operations Used

| Operation         | Purpose                                             |
|------------------|-----------------------------------------------------|
| `1 << x`          | Left shift → set bit at position `x`               |
| `n & (1 << x)`    | Check if bit at position `x` is set in `n`         |
| `res | (1 << y)`  | Set bit at position `y` in result variable         |
| `|` (OR)          | Merge set bits                                     |
| `&` (AND)         | Check bit status                                   |

---

## 🧪 More Examples

| n   | Palindromic Binary | Decimal |
|-----|---------------------|---------|
| 1   | `1`                 | 1       |
| 2   | `11`                | 3       |
| 3   | `101`               | 5       |
| 4   | `111`               | 7       |
| 5   | `1001`              | 9       |
| 6   | `1111`              | 15      |
| 7   | `10001`             | 17      |
| 8   | `10101`             | 21      |
| 9   | `11011`             | 27      |
| 10  | `11111`             | 31      |

---

## ⏱️ Complexity Analysis

| Metric            | Value     |
|-------------------|-----------|
| Time Complexity   | O(log n)  |
| Space Complexity  | O(1)      |

- Time is **logarithmic** due to iterating over increasing binary lengths.
- Space is **constant**, no extra memory needed.
