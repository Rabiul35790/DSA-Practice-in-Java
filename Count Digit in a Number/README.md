# 📊 Digit Counter in Java

This Java program calculates the **number of digits** in a given non-negative integer.

---

## 📌 Features

- Accepts an integer input from the user.
- Uses a custom method to count the number of digits.
- Displays the total digit count.
- Handles the edge case where the input is `0`.

---

## 🧠 Algorithm

The program follows these steps:

1. **Read input** from the user using `Scanner`.
2. Pass the input number to the `count(int n)` function.
3. In the `count` method:
    - If the number is `0`, return `1` (as `0` is a single-digit number).
    - Otherwise:
        - Repeatedly divide the number by 10.
        - Increment a `count` variable on each iteration.
4. **Return** the digit count to `main` and print the result.