import java.util.*;
public class Find_Index_Position_in_One_dimension {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int numbers[] = new int [size];

        // find this numbers's index position
        System.out.println("enter the number whose index to be found");
        int x = sc.nextInt();

        System.out.println("enter the values of array");
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        for (int i=0; i<size; i++){
            if (numbers[i] == x){
                System.out.println("x found at index:"+i);
            }
        }
    }
}
