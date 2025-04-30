# LeetCode Problem 1295: Find Numbers with Even Number of Digits

## 🧩 Problem Description

You are given an array of integers. Your task is to determine how many numbers in the array contain an **even number of digits**.

This is a basic array and number manipulation problem that checks your ability to process individual integers and apply mathematical logic.

---

## 🔢 Example 1

**Input:**  
nums = [12, 345, 2, 6, 7896]

**Process:**  
- 12 → 2 digits → even  
- 345 → 3 digits → odd  
- 2 → 1 digit → odd  
- 6 → 1 digit → odd  
- 7896 → 4 digits → even

**Output:**  
2 (Only 12 and 7896 have an even number of digits)

---

## 🔢 Example 2

**Input:**  
nums = [555, 901, 482, 1771]

**Process:**  
- 555 → 3 digits → odd  
- 901 → 3 digits → odd  
- 482 → 3 digits → odd  
- 1771 → 4 digits → even

**Output:**  
1 (Only 1771 has an even number of digits)

---

## 🧠 Mathematical Insight

To solve this problem, we must:

1. **Count the number of digits** in each integer.  
   This can be done by dividing the number repeatedly by 10 and counting the steps until it becomes zero.

2. **Check whether the digit count is even**.  
   If yes, increase the final count.

3. Repeat this process for every number in the array.

---

## 📊 Constraints

- The size of the array `nums` is between 1 and 500.
- Each integer in the array is between 1 and 100000.

---

## ✅ Goal

Return the total count of numbers that contain an even number of digits.

