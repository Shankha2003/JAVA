import java.util.*;
public class switches {
    public static void main(String[] args) {
        System.out.println("Choose a switch to print hello in different language");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {

            case 1 : System.out.println(" Namaste");
            break;
            case 2 : System.out.println("Konichiwa");
            break;
            case 3 : System.out.println(" Bonjour");
            break;
            default : System.out.println(" Invalid Number");

        }
    }
}
