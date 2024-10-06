public class For_Loop {
    public static void main(String[] args) {
        
        // 1 to 10
        for (int i=0; i<=10; i++){
            System.out.println(i);
        }

        // 10 to 1
        for (int i=10; i>=1; i--){
            System.out.println(i);
        }

        // a to z
        for (char ch ='a'; ch <= 'z'; ch++){
            System.out.println(ch);
        }

        // z to a
        for (char ch ='z'; ch >= 'a'; ch--){
            System.out.println(ch);
        }

        // print a statement
        for (int i=0; i<5; i++){
            System.out.println("hello world");
        }

        // print a given number table
        int n = 2;
        for (int i=1; i<=10; i++){
            System.out.println(n*i);
        }

        // print a given number complete table
        int m = 19;
        for (int i=1; i<=10; i++){
            System.out.println(m + "*" +i+ "=" + (m*i));
        }


    }
}
