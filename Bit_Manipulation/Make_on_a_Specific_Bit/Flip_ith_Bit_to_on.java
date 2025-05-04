package Bit_Manipulation.Make_on_a_Specific_Bit;

import java.util.Scanner;

public class Flip_ith_Bit_to_on {

    static int makeMask(int i) {
        int mask = 1 << i;
        return mask;
    }

    static int flipBit(int n, int i) {
        int mask = makeMask(i);
        return n | mask;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int res = flipBit(n,i);
        System.out.println(res);
        sc.close(); 
    }
}
