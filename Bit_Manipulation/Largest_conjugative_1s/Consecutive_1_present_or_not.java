package Bit_Manipulation.Largest_conjugative_1s;
import java.util.Scanner;

public class Consecutive_1_present_or_not {
    
    static boolean ConjYN(int a) {
        if((a & (a << 1)) != 0) {
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean res = ConjYN(a);
        System.out.println(res);
        sc.close();
    }
    
}

