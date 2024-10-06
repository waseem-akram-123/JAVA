import java.util.*;
public class Print_Name {

    public static void printName (String name){
        System.out.println("your name is :"+ name);
        return;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the name:");
        String name = sc.nextLine();

        printName(name);


    }
}
