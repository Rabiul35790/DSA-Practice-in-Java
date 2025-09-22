package Recursion.Number_ofDigit;

import java.util.Scanner;

public class Digit {

    static int countDig(int n) {
        if(n == 0) return 0;
        return countDig(n/10) + 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDig(n));
        sc.close();

    }
    
}
