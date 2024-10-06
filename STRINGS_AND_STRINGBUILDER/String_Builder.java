public class String_Builder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //get a char
        System.out.println(sb.charAt(2));

        // set a char
        sb.setCharAt(0, 's');
        System.out.println(sb);

        // insert a char
        System.out.println(sb.insert(2, 'n'));

        // delete a char
        System.out.println(sb.delete(2, 3));

        // append the characters
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append ("e");
        sb1.append ("l");
        sb1.append ("l");
        sb1.append ("o");
        System.out.println(sb1);

    }
}
