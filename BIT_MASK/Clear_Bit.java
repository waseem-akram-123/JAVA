public class Clear_Bit {
    public static void main(String[] args) {
        
        // clear the 3rd bit (position = 2) of a number n (n = 0101)
        // Bit Mask : 1<<i
        // operation : AND With NOT (Bit Mask)

        int n =5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~ (bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
