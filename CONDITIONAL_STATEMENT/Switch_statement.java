import java.util.*;
public class Switch_statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the button number");
        int button = sc.nextInt();

        // print greetings
        switch (button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("bonjour");
            break;
            case 3 : System.out.println("hola");
            break;
            case 4 : System.out.println("bow");
            break;
            default : System.out.println("invalid button");
        }

        // print Day

        System.out.println("enter the day number from (1-7)");
        int day = sc.nextInt();

        switch (day) {
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("tuesday");;
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");;
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("saturday");;
            break;
            case 7 : System.out.println("sunday");
            break;
            default : System.out.println("invalid day");
        }

    }
}
