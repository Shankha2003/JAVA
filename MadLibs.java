import java.util.*;

public class MadLibs {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective");
        adjective1 = sc.nextLine();
        System.out.println("Enter a noun");
        noun1 = sc.nextLine();
        System.out.println("Enter an adjective");
        adjective2 = sc.nextLine();
        System.out.println("Enter a verb with 'ing' ");
        verb1 = sc.nextLine();
        System.out.println("Enter an adjective");
        adjective3 = sc.nextLine();

        System.out.println("Today I went to a " + adjective1 + " Zoo .");
        System.out.println(" In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println(" I was " + adjective3 + "!");

        sc.close();
     }   
}
