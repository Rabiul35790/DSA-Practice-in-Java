package Prime_Number_Check;
import java.util.Scanner;

public class Most_Efficient_Prime_Check {

    static boolean isPrime(int a) {
        if(a == 1) {  //iliminating 1
            return false;
        }
        if (a == 2 || a == 3) { //checking hardly 2 and 3 which are prime
            return true; 
        }
        if(a % 2 == 0 || a % 3 == 0){ // iliminating those numbers who are factor of 2 and 3
            return false;
        }
        for(int i = 5; i <= Math.sqrt(a); i = i + 6) { // start from 5 and then go to sqrt of number and increament by 6
            if (a % i == 0 || a % (i + 2) == 0) { // finally checking i and i+2 are factors of the number or not
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
