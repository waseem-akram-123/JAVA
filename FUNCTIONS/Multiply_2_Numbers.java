import java.util.*;
public class Multiply_2_Numbers {

    public static int calcProduct (int a, int b){
        int ans = a*b;
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the two numbers :");
        int a = sc.nextInt();
        int b= sc.nextInt();

        int ans = calcProduct(a, b);

        System.out.println("multiplication answer is :"+ ans);
        
    }
}
