class Animal {
    public void eat (){
        System.out.println("eating");
    }
}

class Dog extends Animal {
    public void eat (){
        System.out.println("eats bread");
    }

    public void bark (){
        System.out.println("barking");
    }

    public void printInfo (){
        eat();
        super.eat();

    }
}

public class Super2 {
    public static void main (String args[]){

        Dog d1 = new Dog ();
        d1.printInfo();

    }
}
