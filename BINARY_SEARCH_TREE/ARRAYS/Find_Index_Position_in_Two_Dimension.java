import java.util.*;
public class Find_Index_Position_in_Two_Dimension {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the no. of rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int numbers [][] = new int [rows][columns];

        System.out.println("enter the number whose index to be founded");
        int x = sc.nextInt();

        System.out.println("enter the values of array");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("array is");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                if (numbers[i][j] == x){
                    System.out.println("x found at index"+i+","+j);
                }
            }
        }
    }
}
