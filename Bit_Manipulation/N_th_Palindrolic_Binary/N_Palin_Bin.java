package Bit_Manipulation.N_th_Palindrolic_Binary;

import java.util.Scanner;

public class N_Palin_Bin {

    static int revBin(int half, int l) {
        int f = 0, rev = 0;
        l = l - 1;
        while(l > f) {
            if(((1<<l) & half) != 0) {
                rev = rev | 1 << f;
            }
            if(((1 << f) & half) != 0) {
                rev = rev | 1 << l;
            }
            l--;
            f++;
        }
        return rev;
    }

    static int palinBin(int n) {
        int count = 0, l = 0;
        while(count < n) {
            l++;
            count += (int)Math.pow(2, (l - 1)/2);
        }
        count -= (int)Math.pow(2, (l - 1)/2);

        int element = n - count - 1;
        int ans = (1 << (l - 1) | element << (l/2));
        ans = ans | revBin(ans,l);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = palinBin(n);
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(ans));
        sc.close();

    }
    
}
