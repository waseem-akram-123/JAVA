public class Occurence_Of_Element {

    static int first = -1;
    static int last = -1;

    public static void findOccur (String str, int idx, char element){
        if (idx == str.length()){
            System.out.println("first apperance is :"+ first);
            System.out.println("last apperance is :"+ last);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == element){
            if (first == -1){   
                first = idx;
            }
            else {             
                last = idx;
            }
        }
        findOccur(str, idx+1, element);
    }
    public static void main(String[] args) {
        
        String str = "abaacdaefaah";
        findOccur(str, 0, 'a');
    }
}
