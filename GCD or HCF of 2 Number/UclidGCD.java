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
