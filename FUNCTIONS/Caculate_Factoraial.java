import java.util.*;
public class Caculate_Factoraial {

    public static int calcFact (int n){
        int fact = 1;
        for (int i=n; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        System.out.println("factorial of the number is :" + calcFact (num));
    }
}
