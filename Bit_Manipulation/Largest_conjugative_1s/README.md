# 🧠 Bit Manipulation – Consecutive 1s in Binary

This repository contains solutions and detailed theoretical explanations for the following two bit manipulation problems:

1. ✅ Check if Consecutive 1s are Present in Binary
2. ✅ Find the Length of the Longest Consecutive 1s in Binary

---

## 🔹 Problem 1: Check if Consecutive 1s are Present in Binary

### 📌 Problem Description

Given an integer `a`, determine whether its binary representation contains **two or more consecutive 1s**.

### 🧠 Core Idea

We can use bitwise operations to check for consecutive 1s without manually converting to binary.

### 🧮 Bitwise Insight

To detect consecutive 1s:
- Use the expression: a & (a << 1)
- If the result is non-zero, it means there are consecutive 1s.

### 🔍 Mathematical Example

Let’s consider `a = 13`:
- Binary of 13: `1101`
- Left shift 13 by 1: `11010`
- Now, apply bitwise AND:

1101 (13)
& 11010 (13 << 1)
= 1100 → non-zero → Consecutive 1s exist ✅
