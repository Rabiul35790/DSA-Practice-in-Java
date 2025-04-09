# Trailing Zeros in Factorials  

## Overview  
This document explains an efficient method to calculate the number of trailing zeros in the factorial of a number \( n \) using mathematical reasoning instead of direct calculation.  

## Understanding Factorials  
The factorial of \( n \) (denoted \( n! \)) is the product of all positive integers up to \( n \). For example:  
- \( 5! = 5 * 4 * 3 * 2 * 1 = 120 \)  

## Trailing Zeros  
Trailing zeros are the zeros that appear at the end of a number. In factorials, these zeros are created by multiplying factors of 10.
Since 10 = 2 × 5 and factorials have more factors of 2 than 5, we only need to count the number of times 5 appears as a factor in the numbers from 1 to 𝑛. 

## Calculation Method  
To find the number of trailing zeros in \( n! \):  
### Formula  
\[  
\text{Trailing Zeros} = \left\lfloor \frac{n}{5} \right\rfloor + \left\lfloor \frac{n}{25} \right\rfloor + \left\lfloor \frac{n}{125} \right\rfloor + \ldots  
\]  
This continues until \( 5^k > n \).  

### Steps to Calculate Trailing Zeros  
1. **Initialize Variables**:  
   - `result`: to store the count of trailing zeros.  
   - `powerOfFive`: initialized to 5.  

2. **Iterative Calculation**:  
   - While \( n \geq \text{powerOfFive} \):  
     - Add \( \left\lfloor \frac{n}{\text{powerOfFive}} \right\rfloor \) to `result`.  
     - Multiply `powerOfFive` by 5 to check higher powers.  

3. **Output the Result**: The `result` will provide the total trailing zeros once the loop completes.  

## Example Calculations  
1. **For 5!**:  
   \[  
   \text{Trailing Zeros} = \left\lfloor \frac{5}{5} \right\rfloor + 0 = 1  
   \]  

2. **For 25!**:  
   \[  
   \text{Trailing Zeros} = \left\lfloor \frac{25}{5} \right\rfloor + \left\lfloor \frac{25}{25} \right\rfloor = 5 + 1 = 6  
   \]  

3. **For 200!**:  
   \[  
   \text{Trailing Zeros} = \left\lfloor \frac{200}{5} \right\rfloor + \left\lfloor \frac{200}{25} \right\rfloor + \left\lfloor \frac{200}{125} \right\rfloor = 40 + 8 + 1 = 49  
   \]  

## Conclusion  
This method provides a streamlined way to compute the number of trailing zeros in a factorial, optimizing the calculation for larger values of \( n \).  

For further exploration, you can check out the original lecture: [Find the Number Of Trailing Zeros In A Factorial | FREE DSA Course in JAVA | Lecture 7 - YouTube](https://www.youtube.com/watch?v=67f6741db44f90e1e1a063f8).  
