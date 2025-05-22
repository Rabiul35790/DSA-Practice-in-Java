package Bit_Manipulation.Number_of_Trailing_Zero_Binary;

import java.util.Scanner;

public class Trailing_zero_in_Binary {

    static int numberTZ(int n) {
        
        int mask = n & (n-1);
        int num = n ^ mask;
        int res = (int)(Math.log10(num)/Math.log10(2));
        return res;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tz = numberTZ(n);
        System.out.println(tz);
        sc.close();
    }
}
