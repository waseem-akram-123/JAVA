public class Uniary {
    public static void main(String[] args) {
        
        // Uniary operator

        int i = 1;

        // post increment
        System.out.println(i++); // 1
        System.out.println(i);  // 2

        // post decrement
        System.out.println(i--); // 2
        System.out.println(i);  //1

        // pre increment 
        System.out.println(++i);  // 2
        System.out.println(i);    // 2

        // pre decrement
        System.out.println(--i);  // 1
        System.out.println(i);   //1 
    }
}
