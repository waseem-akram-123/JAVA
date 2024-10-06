class Animal {
    public void eat (){
        System.out.println("animal eats");
    }
}
class Dog extends Animal {                  // singel level inheritance
    public void bark() {
        System.out.println("barking");
    }
}
class Tiger extends Dog {                   // multi level inheritance
    public void run (){
        System.out.println("running");     
    }
}
class Cat extends Animal {                  // hierarchial level inheritance
    public void meow (){
        System.out.println("meowing");
    }
}
public class inheritance {
    public static void main (String args[]){

        Dog d1 = new Dog ();
        d1.eat();
        d1.bark();

        Tiger t1 = new Tiger ();
        t1.eat();
        t1.bark();
        t1.run();

        Cat c1 = new Cat ();
        c1.eat();
        c1.meow();
    }
    
}
