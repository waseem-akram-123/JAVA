public class String_Handling_Functions {
    public static void main(String[] args) {
        
        // STRING IN JAVA ARE IMMUTABLE 

        // String Concatenation
        String firstname = "waseem ";
        String lastname = "akram";
        System.out.println(firstname+lastname);

        //String Length
        String fullname = "waseem akram";
        System.out.println(fullname.length());

        // String comparisons 

        // 1. when string are equal
        String name1 = "apple";
        String name2 = "apple";
        System.out.println(name1.compareTo(name2));

        // 2. when string 1 is greater than string 2
        String name3 = "banana";
        String name4 = "apple";
        System.out.println(name3.compareTo(name4));

        // 2. when string 1 is greater than string 2
        String name5 = "apple";
        String name6= "chicko";
        System.out.println(name5.compareTo(name6));

        // charAt
        String str = "waseem";
        for (int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

        //sub strings
         String name = "aman junaid khan";

         System.out.println(name.substring(0,4));
         System.out.println(name.substring(5));
    }
}
