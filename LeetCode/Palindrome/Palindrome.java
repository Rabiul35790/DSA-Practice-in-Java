//Without converting to string solution
import java.util.Scanner;
class Palindrome {

    static int countPow(int x) {
        int count = 0;
        int pow = 1;
        while(x>0) {
            x = x / 10;
            count++;
        }
        for(int i = count; i>1; i--) {
            pow = pow * 10;
        }
        return pow;
    }
    static boolean isPalindrome(int x) {
        if (x == 0) {
           return true; 
        }
        if(x > 0) {
        int temp = x;
        int p = countPow(x);
        int rev = 0;
        while(x>0) {
            int r = x % 10;
            x = x / 10;
            rev = rev + (r * p); 
            p = p / 10;
        }
        if(rev == temp)
        {
            return true;
        } else{
            return false;
        } 
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(isPalindrome(x));
            sc.close();
        }
}