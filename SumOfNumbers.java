
import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a Digit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0 ;
        for (int i = 1; i <=n; i++){
            sum = sum +i ;
        }
        System.out.println(sum);
    }
    
}
