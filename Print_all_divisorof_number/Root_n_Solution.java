package Print_all_divisorof_number;

import java.util.Scanner;

public class Root_n_Solution {

    static void printDivisor(int a) {
        for(int i = 1; i*i <= a; i++) {
            if(a%i == 0) {
                System.out.println(i);
                if(i != a/i) {
                    System.out.println(a/i);
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printDivisor(a);
        sc.close();
    }
    
}
