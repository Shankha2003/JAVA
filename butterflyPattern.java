import java.util.*;
public class butterflyPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i ; j++){
                System.err.print("*");
            }

            int space = 2*(n-i);
            for(int j = 1; j<=space; j++){
                    System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
               System.out.print("*");
            }
             System.out.println();
        }
         for(int i = n; i >= 1 ; i--){
            for(int j = 1; j <= i ; j++){
                System.err.print("*");
            }

            int space = 2*(n-i);
            for(int j = 1; j<=space; j++){
                    System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
               System.out.print("*");
            }
             System.out.println();

         }
    }
    
}
