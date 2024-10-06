public class Calculate_Fibonachi {

    public static int calcFib (int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int fibNm1 = calcFib(n-1);
        int fibNm2 = calcFib(n-2);
        int fibN = fibNm1 + fibNm2;
        return fibN;
    }
    public static void main(String[] args) {
        
        int n = 7;
        System.out.println("fibonachi answer is :"+ calcFib (n));
    }
}
