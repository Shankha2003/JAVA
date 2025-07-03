import java.util.*;

public class recursionsThree {
    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += 1;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
   
    }
    
    public static void main(String[] args) {
             printSum(1, 9,0);
    }
}
