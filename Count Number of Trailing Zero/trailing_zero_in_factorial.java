
import java.util.Scanner;
public class Main
{
    static int trailzero(int n){
        int res = 0;
        int powof5 = 5;
        while(n >= powof5){
            res = res + (n/powof5);
            powof5 = powof5 * 5;
        }
        return res;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.println(trailzero(n));
	}
}