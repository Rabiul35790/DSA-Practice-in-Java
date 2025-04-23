import java.util.Scanner;

public class Decimal_to_Binary {

    static String decimaltoBinary(int a) {
        String b = "";

        while(a>=1) {
            int x = a%2;
            a = a/2;
            b = x + b;
        }
        return b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(decimaltoBinary(a));
        sc.close();
    }
    
}
