abstract class Animal {
    abstract void walk();   // public void walk (){}  // void walk(){}
}

class Horse extends Animal {
    public void walk (){
        System.out.println("walks on 4 legs");
    }
}

class Duck extends Animal {
    public void walk (){
        System.out.println("walks on 2 legs");
    }
}

public class Abstarction {
    public static void main (String args []){

        Horse h1 = new Horse ();
        h1.walk();

        Duck d1 = new Duck ();
        d1.walk();

    }
}
