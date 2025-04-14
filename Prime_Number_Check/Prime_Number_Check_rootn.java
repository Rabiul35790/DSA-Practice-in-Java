package Prime_Number_Check;
import java.util.Scanner;

public class Prime_Number_Check_rootn {
    static boolean isPrime(int a) {
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPrime(a));
        sc.close();
    }
    
}
