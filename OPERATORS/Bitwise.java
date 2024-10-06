public class Bitwise {
    public static void main(String[] args) {
        
        // Bitwise opearor

        int a = 3;
        int b = 4;

        //binary AND
        System.out.println(a & b);  // 0

        //binary OR
        System.out.println(a | b);  // 7

        //binary XOR
        System.out.println(a ^ b);  // 7

        //binary one's complement
        System.out.println(~(a));  // 4
        System.out.println(~(b));  // 3

        // binary left shift
        int c = 1;
        System.out.println(c << 2);  // 4

        // binary right shift
        System.out.println(c >> 2);  // 0


    }
}
