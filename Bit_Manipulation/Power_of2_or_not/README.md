# ⚡ Power of 2 — Bit Manipulation Approach

## ✅ Problem

Determine whether a given positive integer is a power of 2 using bit manipulation — without using strings, loops, or logarithmic functions.

---

## 💡 Key Concept

A number is a **power of 2** if **exactly one bit is set** in its binary representation.

### Binary View of Powers of 2

| Decimal | Binary   |
|---------|----------|
| 1       | 0001     |
| 2       | 0010     |
| 4       | 0100     |
| 8       | 1000     |
| 16      | 00010000 |
| ...     | ...      |

All of these numbers have **only one `1` bit** in their binary form.

---

## 🧠 Bit Manipulation Trick

To check whether a number `n` is a power of 2, use the expression:

n & (n - 1) == 0


This works based on the following reasoning:

- For any power of 2, `n`, its binary representation has a single `1` followed by zeros.
- Subtracting `1` from `n` flips all bits after the rightmost set bit (and includes the bit itself).
- Performing `AND` with the original number clears that single set bit.
- The result becomes `0` only when there was exactly one bit set.

### Example 1:
n = 8 => 1000 (binary)
n - 1 = 7 => 0111
n & (n-1) => 1000 & 0111 = 0000 ✅ → Power of 2


### Example 2:
n = 10 => 1010
n - 1 = 9 => 1001
n & (n-1) => 1010 & 1001 = 1000 ❌ → Not a power of 2



---

## ⚠️ Special Case

The number `0` is **not** a power of 2. It has no bits set, so it must be excluded explicitly.

---

## ⏱️ Time and Space Complexity

| Type             | Complexity |
|------------------|------------|
| Time Complexity  | O(1)       |
| Space Complexity | O(1)       |

The check uses only one bitwise operation and one comparison — both take constant time.

---

## 📝 Summary

- A power of 2 has exactly one set bit in binary.
- The trick `n & (n - 1) == 0` effectively checks for that.
- Always exclude `n == 0` as it's not a valid power of 2.
- This is the most efficient method available for this check.

