# GCD Calculation Methods

### Example: Finding GCD of `A = 48` and `B = 18`

---

## 1. Brute Force Method

**Description**:  
Check each integer from the smaller number down to 1 to find the greatest common divisor.

**Steps**:
- Minimum of `A` and `B`: `min(48, 18) = 18`
- Check divisibility from 18 down to 1:
  - 18 ❌  
  - 17 ❌  
  - 16 ❌  
  - 15 ❌  
  - 14 ❌  
  - 13 ❌  
  - 12 ✅  
  - 11 ❌  
  - 10 ❌  
  - 9 ❌  
  - 8 ❌  
  - 7 ❌  
  - 6 ✅  
  - 5 ❌  
  - 4 ❌  
  - 3 ✅  
  - 2 ✅  
  - 1 ✅  

**Result**: `GCD = 6`

**Time Complexity**: `O(n)`, where `n = min(A, B)`

---

## 2. Euclid's Algorithm (Subtraction Method)

**Description**:  
Subtract the smaller number from the larger until both numbers become equal.

**Steps**:  
A = 48, B = 18  
A = 30 (48 - 18), B = 18  
A = 12 (30 - 18), B = 18  
A = 12, B = 6 (18 - 12)  
A = 6 (12 - 6), B = 6  



**Result**: `GCD = 6`

**Time Complexity**: Up to `O(n)` in the worst case, but usually better than brute force.

---

## 3. Euclid's Algorithm (Division Method)

**Description**:  
Use modulo operation to reduce the problem efficiently.

**Steps**:  
GCD(48, 18) => 48 % 18 = 12  
GCD(18, 12) => 18 % 12 = 6  
GCD(12, 6) => 12 % 6 = 0  
Result: GCD = 6



**Result**: `GCD = 6`

**Time Complexity**: `O(log n)`

---

## Summary

| Method                  | GCD | Time Complexity | Notes                          |
|-------------------------|-----|------------------|---------------------------------|
| Brute Force             | 6   | O(n)             | Simple but inefficient          |
| Euclid (Subtraction)    | 6   | Up to O(n)       | More efficient than brute force |
| Euclid(Division)moduler | 6   | O(log n)         | Fastest and most efficient      |

---

## Conclusion

For `A = 48` and `B = 18`:
- ✅ **GCD = 6**
- ✅ **Recommended Method**: **Euclid’s Division Method**
