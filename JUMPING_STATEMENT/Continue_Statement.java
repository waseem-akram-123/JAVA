public class Continue_Statement {
    public static void main(String[] args) {
        
        // print numbers 1 to 10 except 6

        for (int i=1; i <= 10; i++){
            if (i == 6){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // print all odd numbers from 5 to 50
        
        for (int i=5; i <= 50; i++){
            if (i %2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
