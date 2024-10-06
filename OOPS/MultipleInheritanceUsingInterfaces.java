interface Animal {
    void walk();
}

interface Herbivore {
    void eat ();
}

class Horse implements Animal,Herbivore {

    public void walk (){
        System.out.println("walks on 4 legs");
    }

    public void eat (){
        System.out.println("eats grass");
    }
}

public class MultipleInheritanceUsingInterfaces {
    public static void main (String args[]){
        
        Horse h1 = new Horse ();
        h1.walk();
        h1.eat();
    }
}
