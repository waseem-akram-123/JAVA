public class Logical {
    public static void main(String[] args) {
        
        // logical opearor

        //logical AND
        int a = 7;
        int b = 8;
        int c = 9;

        if (c > b && c > a){
            System.out.println("c is grater");
        }

        // logical OR
        if (b > a && b > c){
            System.out.println("b is graeter");   // b > c is false then it is executed
        }

        // logical Not
        System.out.println((3>2));

        System.out.println(!(3>2));

    }
}
