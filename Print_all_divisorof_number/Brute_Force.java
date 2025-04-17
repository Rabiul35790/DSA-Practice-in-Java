package Print_all_divisorof_number;
import java.util.Scanner;

public class Brute_Force {
    static void printDivisor(int a) {
        for(int i = 1; i <= a; i++) {
            if(a%i == 0) {
                System.out.println(i);
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
