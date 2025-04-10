import java.util.Scanner;

public class MainUnoptimize {

    static int gcdhcf (int a, int b) {
        int min = 0;
        if(a<b) {
            min = a;
        }else{
            min = b;
        }
        for(int i=min; i >= 1; i--) {
            if(a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdhcf(a, b));
        sc.close();
    }
    
}

// Time Complexity: O(min(a, b))
// In Simply O(n) where n is the minimum of a and b
// Space Complexity: O(1) as we are using only constant space
