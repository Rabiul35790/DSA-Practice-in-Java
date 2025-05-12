# 🧠 Lonely Integer in Array — Bit Manipulation & Other Approaches

## 🎯 Problem Statement

Given an array of integers where **every element appears twice except for one**, find the **unique lonely integer** that appears only once.

---

## 📌 Constraints

- The input array will always have one element that appears only once.
- All other elements appear **exactly twice**.
- Array length is always odd (1, 3, 5, ...).

---

## ✅ Example

### Input:
arr = [4, 9, 95, 93, 57, 4, 57, 93, 9]


### Output:
95


---

## 🔍 Approach 1: Brute Force with Sorting

### 🧪 Idea:

1. Sort the array.
2. Traverse the array in pairs (i, i+1).
3. If a mismatch is found, return the lonely integer.

### 📦 Time & Space Complexity:
| Type             | Complexity  |
|------------------|-------------|
| Time Complexity  | O(n log n)  |
| Space Complexity | O(1)        |

---

## ⚙️ Approach 2: HashSet (Using Memory)

### 🧪 Idea:

- Use a `HashSet`.
- For each number:
  - If it's already in the set, remove it.
  - If not, add it.
- The remaining item in the set is the lonely integer.

### ✅ Why it works:

Each duplicate number will cancel itself out by add+remove. The unique one will remain.

### 📦 Time & Space Complexity:
| Type             | Complexity |
|------------------|------------|
| Time Complexity  | O(n)       |
| Space Complexity | O(n)       |

---

## ⚡ Approach 3: Bit Manipulation (Most Optimized)

### 🧪 Idea:

Use the XOR operator `^`. This leverages the following properties:

- `a ^ a = 0`
- `a ^ 0 = a`
- XOR is **commutative and associative**

Thus, XOR-ing all the elements will cancel out the duplicates and return the lonely integer.

### 🔄 Example:

arr = [2, 3, 5, 4, 5, 3, 4]
→ res = 0 ^ 2 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4 = 2 ✅



### 📦 Time & Space Complexity:
| Type             | Complexity |
|------------------|------------|
| Time Complexity  | O(n)       |
| Space Complexity | O(1)       |

---

## 🏁 Final Recommendation

| Approach      | Time  | Space | Notes                       |
|---------------|-------|-------|-----------------------------|
| Brute Force   | O(nlogn) | O(1) | Inefficient for large input |
| HashSet       | O(n)  | O(n)  | Better, but uses memory      |
| Bit Manipulation | O(n)  | O(1)  | ✅ Best option overall      |

