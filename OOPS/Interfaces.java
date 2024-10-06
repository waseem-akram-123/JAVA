interface Animal {  
    void walk();
}

class Horse implements Animal {
    public void walk (){
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main (String args[]){

        Horse h1 = new Horse ();
        h1.walk();
    }
}
