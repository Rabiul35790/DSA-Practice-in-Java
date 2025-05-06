# Palindrome Check Without String Conversion

## 📝 Problem Statement

Determine whether a given non-negative integer `x` is a palindrome **without converting the integer to a string**.

A palindrome is a number that reads the same forwards and backwards. For example:
- `121` is a palindrome
- `123` is not

---

## 🔍 Concept Overview

### 🔹 Palindrome Definition

A number is a palindrome if its **reverse is equal to the original number**.

We are restricted from using string operations such as reversing a string or comparing characters. Hence, we solve this mathematically.

---

## 🧠 Mathematical Logic

1. **Count the number of digits** in the number `x`.
   - Divide `x` by `10` repeatedly to determine the number of digits.
   - For example, `1234` has 4 digits.

2. **Calculate the place value of the most significant digit.**
   - This is essentially `10^(number of digits - 1)`.

3. **Construct the reverse of the number mathematically**:
   - Repeatedly extract the last digit using `% 10`
   - Multiply it with the current place value and accumulate to build the reverse.
   - Reduce place value by a factor of 10 each time.

4. **Compare the reversed number with the original**.
   - If they are equal, the number is a palindrome.

---

## 📊 Examples

### Example 1:

**Input:** `x = 121`  
**Process:**
- Original number: 121  
- Reverse:  
  `1 * 100 + 2 * 10 + 1 * 1 = 121`

✅ **Result:** Palindrome (true)

---

### Example 2:

**Input:** `x = 123`  
**Process:**
- Original number: 123  
- Reverse:  
  `3 * 100 + 2 * 10 + 1 * 1 = 321`

❌ **Result:** Not a Palindrome (false)

---

## 🚫 Edge Case

- If `x < 0`, the number is automatically **not a palindrome** (negative numbers are not symmetric).

---

## ✅ Conclusion

This solution avoids converting integers to strings and instead uses basic arithmetic:
- Division (`/`)
- Modulo (`%`)
- Powers of 10

This is particularly useful in environments where string manipulation is expensive or disallowed.
