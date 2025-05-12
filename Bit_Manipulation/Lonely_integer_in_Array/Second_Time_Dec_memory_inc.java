package Bit_Manipulation.Lonely_integer_in_Array;

import java.util.HashSet;
import java.util.Scanner;

public class Second_Time_Dec_memory_inc {
    
    static int lonelyInt(int[] arr) {
        HashSet<Integer> loni = new HashSet<Integer>();
        for(int i : arr) {
            if(loni.contains(i)) {
                loni.remove(i);
            }
            else {
                loni.add(i);
            }
        }
        for(int i : loni) {
            return i;
        }
        
        return -1;
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
