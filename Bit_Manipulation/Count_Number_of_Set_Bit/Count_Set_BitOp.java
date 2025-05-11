package Bit_Manipulation.Count_Number_of_Set_Bit;
import java.util.Scanner;

public class Count_Set_BitOp {

    static int countSetBit(int n) {
        int count = 0;
        while(n>0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countSetBit(n);
        System.out.println(res);
        sc.close();
    }
    
}
