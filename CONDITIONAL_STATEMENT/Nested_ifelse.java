import java.util.*;
public class Nested_ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        // number is positive and even

        System.out.println("enter the number");
        int number = sc.nextInt();

        if (number > 0){
            System.out.println("number is positive");
            if (number %2 == 0){
                System.out.println("number is even");
            }
            else {
                System.out.println("number is odd");
            }
        }
        else {
            System.out.println("number is negative");
        }

    }
}
