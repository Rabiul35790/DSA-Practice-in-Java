# 📘 Prime Factorization of a Number

A **prime factor** of a number is a prime number that divides the number exactly, without leaving a remainder.

Example:  
For `n = 60`, the prime factors are:  
**2, 2, 3, 5** (since 2 × 2 × 3 × 5 = 60)

---

## 1️⃣ Worst Case O(n) Approach

### Concept:
Check every number from `2` to `n`. For each `i`, keep dividing `n` as long as it is divisible by `i`.

### Steps:
1. Input a number `n`
2. Start from `i = 2` and repeat while `n > 1`
3. While `n % i == 0`, print `i` and divide `n` by `i`
4. Increment `i`

### Example for `n = 60`:
Output:  
**2, 2, 3, 5**

### When it is bad:
For large prime numbers like `n = 9973`, it checks every number from `2` to `9972` before printing 9973. This results in slow performance.

---

## 2️⃣ Always O(√n) Approach

### Concept:
A composite number `n` must have at least one factor less than or equal to √n.  
If `n = a × b` and both `a` and `b` are greater than √n, then `a × b > n`, which is a contradiction.

So:
- If a factor exists, it will be found by √n.
- After removing all small factors, if `n > 1`, the remaining part must be a **prime number** greater than √n.

### Steps:
1. Input a number `n`
2. Loop from `i = 2` to `i * i <= n`
3. While `n % i == 0`, print `i` and divide `n` by `i`
4. After the loop, if `n > 1`, print `n` (this is a prime factor)

### Example for `n = 60`:
- Try dividing by 2 → print 2, again print 2  
- Try dividing by 3 → print 3  
- Remaining is 5, which is a prime > √60 → print 5  
Output:  
**2, 2, 3, 5**

### Why it works well for prime numbers:
For `n = 9973` (a prime), no factor will divide it in the loop.  
After reaching the end of the loop, `n` remains 9973 → print it directly.  
This avoids checking up to `n`, and ends after reaching √n ≈ 99.86.

---

## Comparison Table

| Method               | Time Complexity | Output Order | Note                          |
|----------------------|-----------------|--------------|-------------------------------|
| Worst Case O(n)      | O(n)            | Ordered      | Slow for large prime numbers  |
| Always O(√n)         | O(√n)           | Ordered      | Efficient in all cases        |
