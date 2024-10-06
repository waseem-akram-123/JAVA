public class Move_an_element_at_End {

    public static void moveAllX (String str, int idx, int count, String newstr){
        if (idx == str.length()){
            for (int i=0; i<count; i++){
                newstr = newstr+'x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt (idx);
        if (currchar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newstr);
        }
        else {
            newstr = newstr + currchar;
            moveAllX(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {

        String str = "axbcxxd";
        moveAllX (str, 0, 0,"");
        
    }
}
