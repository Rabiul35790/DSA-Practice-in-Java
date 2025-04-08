import java.util.Scanner;

public class Main
{
    static int count(int n){
        
        int count = 0;
        if(n == 0){
            count++;
            return count;
        }
        else{
            while(n>0){
                n = n/10;
                count++;
            }
        }
        return count;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(count(n));
	}
}