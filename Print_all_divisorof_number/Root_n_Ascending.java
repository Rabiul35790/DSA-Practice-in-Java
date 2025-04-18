package Print_all_divisorof_number;
import java.util.Scanner;

public class Root_n_Ascending {

    static void printDivisor(int a) {
        int i = 0;
        for(i = 1; i*i <= a; i++) {
            if(a%i == 0) {
                System.out.println(i);
            }
        }
        for( ; i >= 1 ; i--) {
            if(a % i == 0 && i != a/i) {
                System.out.println(a/i);
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
