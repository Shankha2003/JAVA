import java.util.*;
public class FuntionToMultiply {
    public static int multiplyNumber(int a , int b){
        int mul = a*b;
        return mul;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = multiplyNumber(a,b);
        System.out.println("Multiplication of two Numbers :" + mul);
    }
}
