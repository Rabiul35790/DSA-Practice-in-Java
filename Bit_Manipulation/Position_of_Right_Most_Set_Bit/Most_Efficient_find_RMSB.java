package Bit_Manipulation.Position_of_Right_Most_Set_Bit;
import java.util.Scanner;

public class Most_Efficient_find_RMSB {


    static int posOfRMSB(int n) {
        if(n == 0) {
            return 0;
        }

        int mask = n & (n-1);
        return (int)((Math.log10(n ^ mask)/Math.log10(2)) + 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = posOfRMSB(n);
        if(pos == 0) {
            System.out.println("No set bit present in the number");
        }else {
            System.out.println(pos);
        }
        sc.close();
    }
    
}
