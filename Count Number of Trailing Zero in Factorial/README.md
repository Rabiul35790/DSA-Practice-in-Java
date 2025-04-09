# Trailing Zeros in Factorials

## 📘 Overview
This document explains a simple and efficient method to calculate the number of trailing zeros in the factorial of a number `n` using mathematical logic instead of directly computing the factorial.

---

## ✅ What is a Factorial?
The factorial of a number `n` (written as `n!`) is the product of all positive integers up to `n`.

For example:

---

## ❓ What Are Trailing Zeros?
Trailing zeros are the zeros that appear at the end of a number.  
In factorials, trailing zeros come from factors of `10`.

Since `10 = 2 × 5`, and factorials have more 2s than 5s, we only need to count how many times `5` appears as a factor in numbers from `1` to `n`.

---

Here's how you can write the content shown in the image in `README.md` format using GitHub-flavored markdown and LaTeX math rendering support:

---

## How to Calculate Trailing Zeros in \( n! \)

**Formula:**

```math
\text{Trailing Zeros} = \left\lfloor \frac{n}{5} \right\rfloor + \left\lfloor \frac{n}{25} \right\rfloor + \left\lfloor \frac{n}{125} \right\rfloor + \cdots

Keep adding terms until \( 5^k > n \).
```

---

### ✅ Notes:
- The triple backticks and `math` after them (` ```math `) help render the equation as a block on platforms that support it (e.g., GitHub with math support, some VS Code preview extensions, etc.).
- The `\left\lfloor ... \right\rfloor` renders the floor function.
- Use `##` or `###` for heading levels according to your README structure.


---

### 📝 Step-by-Step Process:

1. **Initialize**:
   - Set `result = 0` to keep count.
   - Start with `powerOfFive = 5`.

2. **Loop**:
   - While `n >= powerOfFive`:
     - Add `n // powerOfFive` to `result`.
     - Multiply `powerOfFive` by 5 to go to the next power.

3. **Final Result**:
   - The final value of `result` is the number of trailing zeros in `n!`.

---

## 🔍 Example Calculations

### Example 1: `5!`

---

### Example 2: `25!`

---

### Example 3: `200!`

---

