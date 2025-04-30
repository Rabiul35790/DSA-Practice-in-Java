package LeetCode.Even_digit_numbers;
import java.util.Scanner;

public class Even_Digit_Number {

    static int countDigits(int n) {
        int count = 0;
        while(n > 0) {
            n = n/10;
            count++;
        }
        return count;
    }


    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int dig = countDigits(nums[i]);
            if( dig % 2 == 0) {
                count++;
            }

        }
        return count;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] nums = new int[a];
        for(int i = 0; i < a; i++) {
            nums[i] = sc.nextInt();
        }
        Even_Digit_Number obj = new Even_Digit_Number();
        System.out.println(obj.findNumbers(nums));
        sc.close();
    }

    
}
