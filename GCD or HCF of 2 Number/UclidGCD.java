import java.util.Scanner;

public class UclidGCD {

    static int ucgcd(int a, int b) {

        int diff = 0;
        while(a != b) {
            if(a < b ) {
                diff = b - a;
                b = diff;


            }else{
                diff = a - b;
                a = diff;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ucgcd(a, b));
        sc.close();
    }
    
}


//Better than Brute Force Approach
// Time Complexity: O(max(a, b)) where a and b are the two numbers
//in the worst case it will take for example a = 100 and b = 1 then 100 time will be iterated
// Space Complexity: O(1) as we are using only constant space