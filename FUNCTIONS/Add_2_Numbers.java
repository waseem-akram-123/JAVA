import java.util.*;
public class Add_2_Numbers {

    public static int calcSum (int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calcSum(a, b);

        System.out.println("addition of two numbers is :"+ sum);


    }
}
