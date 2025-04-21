package Prime_Factor;
import java.util.Scanner;

public class Always_rootn_Solution {
    
    static void primeFactor(int a) {
        int i = 2;
        while(i*i <= a) {
            while(a % i == 0) {
                System.out.println(i);
                a = a/i;
            }
            i++;
        }

        if(a > 1) {
            System.out.println(a);
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        primeFactor(a);
        sc.close();
    }
}
