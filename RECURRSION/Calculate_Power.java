public class Calculate_Power {

    public static int calcPower (int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 1;
        }
        int XPowNm1 = calcPower(x, n-1);
        int XPownN = XPowNm1 *x;
        return XPownN;
    }
    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        System.out.println("power is :" + calcPower(x, n));
        
    }
}
