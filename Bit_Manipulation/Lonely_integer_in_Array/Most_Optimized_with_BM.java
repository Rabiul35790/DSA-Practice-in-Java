package Bit_Manipulation.Lonely_integer_in_Array;
import java.util.Scanner;

public class Most_Optimized_with_BM {
    
    static int lonelyInt(int[] arr) {
        int res = 0;
        for(int i : arr) {
            res = i ^ res;
        }
        return res;
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int lonelyint = lonelyInt(arr);
        System.out.println(lonelyint);
        sc.close();
    }
    
}
