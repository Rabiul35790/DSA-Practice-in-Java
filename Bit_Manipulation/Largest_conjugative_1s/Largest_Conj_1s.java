package Bit_Manipulation.Largest_conjugative_1s;
import java.util.Scanner;

public class Largest_Conj_1s {
    
    static int largeConj(int a) {
        int count = 0;
        while(a > 0) {
            a = (a & (a << 1));
            count++;
        }
        return count;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = largeConj(a);
        System.out.println(res);
        sc.close();
    }
    
}
