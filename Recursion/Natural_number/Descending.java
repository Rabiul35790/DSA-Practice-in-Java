package Recursion.Natural_number;

import java.util.Scanner;

public class Descending {
    static void Print(int n) {
        if(n == 0) return;
        System.out.println(n);
        Print(n-1);

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
        sc.close();
    }
}
