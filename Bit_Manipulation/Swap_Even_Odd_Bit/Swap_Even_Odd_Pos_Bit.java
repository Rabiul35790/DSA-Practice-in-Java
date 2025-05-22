package Bit_Manipulation.Swap_Even_Odd_Bit;

import java.util.Scanner;

public class Swap_Even_Odd_Pos_Bit {

    static int swapBit(int n) {
        int even = -1431655766;// or can replace the number in hexadecimal format 0xaaaaaaaa
        int odd = 1431655765;// or can replace the number in hexadecimal format 0x55555555
        int evenBit = (n & even)>>>1;
        int oddBit = (n & odd) << 1;
        int res = evenBit | oddBit;
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = swapBit(n);
        System.out.println(res);
        sc.close();
    }
    
}
