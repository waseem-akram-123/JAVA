import java.util.*;
public class Else_if_statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // satges in a person life

        System.out.println("enter the age :");
        int age = sc.nextInt();

        if (age <= 12){
            System.out.println("child");
        }
        else if (age >=13 && age <=17){
            System.out.println("teenager");
        }
        else if (age >= 18 && age <= 50){
            System.out.println("adult");
        }
        else {
            System.out.println("senior");
        }
        
        // to find the largest number

        System.out.println("enter a, b and c values :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c ){
            System.out.println("a is largest number");
        }
        else if ( b > a && b > c){
            System.out.println("b is largest number");
        }
        else if (c > a && c > b){
            System.out.println("c is largest number");
        }
        else {
            System.out.println("a, b and c are equal");
        }
    }
}
