package Prime_Factor;
import java.util.Scanner;

public class worst_case_n_solution {
    
    static void primeFactor(int a) {
        int i = 2;
        while(a > 1) {
            while (a % i == 0) {
                System.out.println(i);
                a = a/i;
            }
            i++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        primeFactor(a);
        sc.close();
    }
}
