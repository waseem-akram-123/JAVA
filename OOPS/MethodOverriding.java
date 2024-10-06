class Animal {
    public void makeSound (){
        System.out.println("animal sounds");
    }
}

class Dog extends Animal {
    public void makeSound (){
        System.out.println("dog barks");
    }
}

public class MethodOverriding {
    public static void main (String args []){

        Animal a1 = new Animal ();
        a1.makeSound();

        Dog d1 = new Dog();
        d1.makeSound();

    }
}
