import java.util.*;

public class Basics_of_String {
    public static void main(String[] args) {
        

        // String declaration
        String name1 = "waseem";
        String fullname1 = "waseem akram";
        String sentence = "my name is waseem akram";

        // Input a String
        Scanner sc = new Scanner (System.in);

        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("enter your fullname");
        String fullname = sc.nextLine();

        // Printing the string
        System.out.println(name);
        System.out.println(fullname);
    }
}
