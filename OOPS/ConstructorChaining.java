 abstract class Animal {
    Animal (){
        System.out.println("creating an animal");  // parent 1st call
    }
}
class Horse extends Animal {
    Horse (){
        System.out.println("horse is created");   // child 2nd call
    }
}

public class ConstructorChaining {
    public static void main (String args[]){

        Horse h1 = new Horse();

    }
}
