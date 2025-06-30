import java.util.*;

public class pattern {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

        // first pattern

        for(int i = 1; i <= n ; i++){

            for(int j = 1; j<= m; j++){
                System.out.print("*");
            } 
            System.out.println();
        }         

        //second pattern
        
        for(int i = 1; i<=n; i++ ){
            for(int j = 1; j <= m; j++){
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        


    }
    
}
