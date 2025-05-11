# 🔍 Problem: Count Number of Set Bits

Given an integer `n`, count how many bits are set to `1` in its binary representation.

---

## 🧠 Theory: Brian Kernighan’s Algorithm

This technique smartly eliminates the rightmost set bit (`1`) from `n` one at a time using the operation:

n = n & (n - 1)


### 🔄 Why It Works
- Subtracting 1 from `n` flips all bits after the rightmost `1` (including the rightmost `1`).
- AND-ing with original `n` turns off the rightmost `1`.
- Repeating this process counts how many times a set bit exists.

---

## 🧪 Example

Let `n = 13` → Binary: `1101`

### Iterations:
1. `n = 1101` → `n-1 = 1100` → `n & (n-1) = 1100`
2. `n = 1100` → `n-1 = 1011` → `n & (n-1) = 1000`
3. `n = 1000` → `n-1 = 0111` → `n & (n-1) = 0000`

Count = **3**

✔️ 13 has **3 set bits**.

---

## ⏱️ Time and Space Complexity

- **Time Complexity**:  
  **O(k)**, where `k` is the number of set bits in `n`.  

- **Space Complexity**:  
  **O(1)** – No additional space used.

---

## ✅ Summary

| Property        | Value             |
|----------------|-------------------|
| Input           | A single integer `n` |
| Output          | Count of `1`s in binary form |
| Technique       | `n = n & (n - 1)` |
| Time Complexity | `O(k)` (k = #set bits) |
| Space Complexity| `O(1)`            |

---

## 📌 Note
Brian Kernighan’s Algorithm is **much faster** than checking each bit (which would take `O(log n)` time) when the number of set bits is small relative to the total number of bits.

