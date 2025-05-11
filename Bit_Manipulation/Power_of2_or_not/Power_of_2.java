package Bit_Manipulation.Power_of2_or_not;
import java.util.Scanner;

public class Power_of_2 {
    
    static boolean powOf2(int n) {
        if(n == 0) {
            return false;
        }

        if((n & (n-1)) == 0) {
            return true;
        }else{
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        System.out.println(powOf2(n));
        sc.close();
    }
    
}
