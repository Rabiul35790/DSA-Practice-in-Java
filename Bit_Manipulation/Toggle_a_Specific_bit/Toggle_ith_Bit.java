package Bit_Manipulation.Toggle_a_Specific_bit;

import java.util.Scanner;

public class Toggle_ith_Bit {


    static int tMask(int i) {
        int mask = 1 << i;
        return mask;
    }

    static int toggleBit(int n, int i) {
        int mask = tMask(i);
        return n ^ mask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt(); 
        int res = toggleBit(n, i);
        System.out.println(res);
        sc.close();
    }
    
}
