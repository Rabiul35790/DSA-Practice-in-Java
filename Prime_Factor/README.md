# 📘 Prime Factorization of a Number

A **prime factor** of a number is a prime number that divides the number exactly, without leaving a remainder.

### Example:  
For `n = 60`, the prime factors are:  
**2, 2, 3, 5** (because 2 × 2 × 3 × 5 = 60)

---

## 1️⃣ Worst Case O(n) Approach

### Concept:
Check every number from `2` to `n`. For each `i`, keep dividing `n` as long as it is divisible by `i`.

### Steps:
1. Input a number `n`
2. Start from `i = 2` and repeat while `n > 1`
3. While `n % i == 0`, print `i` and divide `n` by `i`
4. Increment `i` and continue

### Example for `n = 60`:
- 60 is divisible by 2 → print 2 → n becomes 30  
- 30 is divisible by 2 → print 2 → n becomes 15  
- 15 is divisible by 3 → print 3 → n becomes 5  
- 5 is divisible by 5 → print 5 → done  
Output: **2, 2, 3, 5**

### When it is bad:
For a large prime number like `n = 9973`, it checks every number from 2 to 9972 before printing 9973. This results in slow performance.

---

## 2️⃣ Efficient Approach (Loop till √n)

### Concept:
Any non-prime number must have at least one prime factor less than or equal to √n.  
If `n = a × b` and both `a` and `b` are greater than √n, then `a × b > n`, which is not possible.

So, to find all prime factors:
- Only need to check up to √n
- After removing all small prime factors, if `n > 1`, the remaining `n` is itself a prime number

### Steps:
1. Input a number `n`
2. Loop from `i = 2` to `i * i <= n`
3. While `n % i == 0`, print `i` and divide `n` by `i`
4. After the loop, if `n > 1`, print `n` (it is a prime)

### Example for `n = 60`:
- Try dividing by 2 → print 2 → again print 2 → n becomes 15  
- Try dividing by 3 → print 3 → n becomes 5  
- `i` moves to 4, 5 → 5 is prime and divides → print 5  
Output: **2, 2, 3, 5**

### Why it works well for prime numbers:
For `n = 9973` (a prime), no `i` from 2 to √9973 divides it.  
After the loop, since `n > 1`, it directly prints 9973.  
So it avoids unnecessary checks and exits early.

---

## Comparison Table

| Method                  | Time Complexity     | Output Order | Note                          |
|-------------------------|---------------------|--------------|-------------------------------|
| Worst Case O(n)         | O(n)                | Ordered      | Slow for large prime numbers  |
| Efficient Loop till √n  | O(√n × log n)        | Ordered      | Efficient in all cases        |
