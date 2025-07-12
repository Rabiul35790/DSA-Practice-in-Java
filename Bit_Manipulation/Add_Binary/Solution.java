package Bit_Manipulation.Add_Binary;

public class Solution {

    public String addBinary(String a, String b) {
        String sum = "";
        int carry = 0;
        int charA,charB;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i >= 0){
                charA = a.charAt(i) - '0';
            } else {
                charA = 0;
            }
            if(j >= 0){
                charB = b.charAt(j) - '0';
            } else {
                charB = 0;
            }

            int s = charA + charB + carry;
            sum = s % 2 + sum;
            carry = s / 2;
            i--;
            j--;
        }
        return sum;
    }
    
}
