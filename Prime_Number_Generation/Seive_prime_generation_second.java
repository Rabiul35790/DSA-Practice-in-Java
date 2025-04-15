package Prime_Number_Generation;
import java.util.Scanner;

class Seive_prime_generation_second{

    static void generatePrime(int a) {
        boolean[] prime = new boolean[a+1];
        for(int i = 2; i <= a; i++) {
            if(prime[i] == false) {
                for(int j = i*i; j <= a; j = j + i) {
                    prime[j] = true;
                }
            }
        }

        for(int i = 2; i <= a; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        generatePrime(a);
        sc.close();     
    }
}