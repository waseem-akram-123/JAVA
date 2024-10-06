import java.util.*;
public class If_and_If_else_Statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //  a person is able to vote or not (adult)

        System.out.println("enter the age");
        int age = sc.nextInt();
        
        if (age >= 18){
            System.out.println("eligible for vote");
        }
        else {
            System.out.println("not eligible for vote");
        }

        // number is even or odd

        System.out.println("enter the number");
        int num = sc.nextInt();

        if (num %2 == 0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }

        // number is negative or positive

        System.out.println("enter the number");
        int numb = sc.nextInt();

        if (numb > 0){
            System.out.println("number is positive");
        }
        else {
            System.out.println("number is negative");
        }

        // to find greater number

        System.out.println("enter the values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("a is graeter");
        }
        else {
            System.out.println("b is greater");
        }

        

    }
}
