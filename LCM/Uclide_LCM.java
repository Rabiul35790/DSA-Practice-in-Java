import java.util.Scanner;

public class Uclide_LCM {
    static int uclide_lcm(int a, int b) {
        int mul = a * b;
        int lcm;
        
        while(a != 0 && b != 0){
            if (a > b){
                a = a % b;
            }else{
                b = b % a;
           }
        }
        if(a == 0){
            lcm = mul / b;
        }
        else{
            lcm = mul / a;
        }
        return lcm;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(uclide_lcm(a, b));
        sc.close();
    }
}
