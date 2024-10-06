public class Reverse_SB {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("helloo");
        System.out.print(sb);
        
        for (int i=0; i<sb.length()/2; i++){
            int first = i;
            int last = sb.length()-i-1;

            char frontchar = sb.charAt (first);
            char lastchar = sb.charAt (last);

            sb.setCharAt(first, lastchar);
            sb.setCharAt(last, frontchar);
        }
        System.out.println();
        System.out.print(sb);
    }
}
