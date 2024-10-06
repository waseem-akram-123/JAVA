class Animal {
    String color = "multi-color";
}

class Duck extends Animal {
    String color = "white-grey";

    public void printColor (){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class Super1 {
    public static void main (String args[]){

        Duck d1 = new Duck ();
        d1.printColor();

    }
}
