public class Set_Bit {
    public static void main(String[] args) {
        
        // set the 2nd bit (position = 1) of a number n (n = 0101)
        // Bit Mask : 1<<i
        // operation : OR

        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
