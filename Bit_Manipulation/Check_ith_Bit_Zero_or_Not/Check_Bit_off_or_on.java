package Bit_Manipulation.Check_ith_Bit_Zero_or_Not;

import java.util.Scanner;

public class Check_Bit_off_or_on {

    static int makeMask(int i) {
        int mask = 1 << i;
        return mask;
    }

    static int check(int n, int i) {
        int mask = makeMask(i);
        int result = n & mask;
        return result;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number
        int i = sc.nextInt(); // bit position to check
        int res = check(n, i);
        if (res == 0) {
            System.out.println("OFF");
        }
        else {
            System.out.println("ON");
        }
        sc.close();
    }
}
