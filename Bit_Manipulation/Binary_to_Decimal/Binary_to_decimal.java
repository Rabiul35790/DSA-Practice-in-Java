package Bit_Manipulation.Binary_to_Decimal;

import java.util.Scanner;

public class Binary_to_decimal {

    static int binaryToDecimal(String a) {
        
        int powerof2 = 1;
        int decimal = 0;


        for(int i = a.length()-1; i>=0; i--) {
            if(a.charAt(i) == '1') {
                decimal = decimal + powerof2;
            }
            powerof2 = powerof2 * 2;

        }
        return decimal;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = binaryToDecimal(a);
        System.out.println(b);
        sc.close();
        
    }
    
}
