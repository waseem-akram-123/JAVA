public class Type_conversion_And_Type_casting {
    public static void main(String[] args) {

        // type conversion  lower datatype --> higher datatype
        int a = 5;
        float b = a;
        System.out.println(b);

        // type casting     higher datatype --> lower datatype   (loss of some data)
        double c = 55.0345;
        int d = (int) c;
        System.out.println(d);

    }
}
