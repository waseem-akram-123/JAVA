class Animal {
    Animal (){
        System.out.println("creating an animal"); // 1st call
    }
}
class Dog extends Animal{
    Dog (){
        super();
        System.out.println("dog is craeted");  // 2nd call
    }
}
public class Super3 {
    public static void main (String args []){

        Dog d1 = new Dog ();

    }
    
}
