import java.util.*;

public class One_Dimensional_Array {
    public static void main(String[] args) {

        //defining an array
        // type [] arrayname = new type [size];

        int marks1 [] = new int [4];
        //OR
        int [] marks2 = new int [4];

        // entering the values for marks1 array
        marks1[0] = 92;
        marks1[1] = 93;
        marks1[2] = 94;
        marks1[3] = 95;

        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        System.out.println(marks1[3]);

        // entering the values for marks2 array
        System.out.println("enter the values of marks 2 array");

        Scanner sc = new Scanner (System.in);

        for (int i=0; i<marks2.length; i++){
            marks2[i] = sc.nextInt();
        }

        System.out.println("marks of array 2 are");
        for (int i=0; i<marks2.length; i++){
            System.out.println(marks2[i]);
        }
    }
}
