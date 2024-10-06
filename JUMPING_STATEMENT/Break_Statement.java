import java.util.*;
public class Break_Statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // 1 to 5

        for (int i = 1; i <= 10; i++){
            if (i == 6){
                break;
            }
            System.out.println(i);
        }

        // keep taking a number input from the user until the user enters an odd number
        int n;
        do {
            System.out.println("enter the number");
            n =sc.nextInt();

            if (n % 2 != 0){
                break;
            }

        } while (n >0);
        System.out.println("you entered an odd number");

        // keep taking a number input from the user until the user enters an mutiple of 7

        int m;
        do {
            System.out.println("enter the number");
            m =sc.nextInt();

            if (m % 7 == 0){
                break;
            }

        } while (m >0);
        System.out.println("you entered a number which is multiple of 7");

    }
}
