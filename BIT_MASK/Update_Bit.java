import java.util.*;

public class Update_Bit {
    public static void main(String[] args) {
        
        // update the 2nd bit (position = 1) of a number n to 1 (n = 0101)
        // Bit Mask : 1<<i
        
        // for : 0                                               for : 1
        // opeartion : AND WITH NOT                              operation : OR

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the opeartion");
        int oper = sc.nextInt();

        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        if (oper == 1){
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {
            // clear
            int newBitMask = ~ (bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
