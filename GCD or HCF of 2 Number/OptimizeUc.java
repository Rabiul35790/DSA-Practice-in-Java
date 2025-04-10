import java.util.Scanner;

public class OptimizeUc {

    static int opuc(int a, int b) {
        while(a != 0 && b != 0) { 
            if(a > b) {
                a = a % b;
            }else{
                b = b % a;
            }
        }
            
        
        if(a == 0) {
            return b;
        }else{
            return a;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read two integers from the user
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Call the ucgcd method to calculate the GCD and print the result
        System.out.println(opuc(a, b));
        
        // Close the scanner to free up resources
        sc.close();
    }
    
}


