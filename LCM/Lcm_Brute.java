
import java.util.Scanner;

public class Lcm_Brute {

    static int lcm(int a, int b) {
        int max = 0;
        boolean found = false;
        int lcm = 0;
        if(a>b) {
            max = a;
        }else {
            max = b;
        }
        while(found == false) {
            if(max % a == 0 && max % b == 0) {
                found = true;
                lcm = max;
            }
            else {
                max++;
            }
        }
        return lcm;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println(lcm(a, b));
        sc.close();
    }
}
