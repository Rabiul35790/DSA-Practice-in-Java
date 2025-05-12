package Bit_Manipulation.Lonely_integer_in_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Brute_force_Lonel_integer {

    static int lonelyInt(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-2; i = i + 2)
        {
            if(arr[i] != arr[i+1]) {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int lonelyint = lonelyInt(arr);
        System.out.println(lonelyint);
        sc.close();
    }
    
}
