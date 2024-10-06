class Pen {
    String color;
    String type;


public void write (){
    System.out.println("pen is writing");
}

public void printInfo (){
    System.out.println(this.color);
    System.out.println(this.type);
}
}

public class basics1 {
    public static void main (String args[]){

        Pen p1 = new Pen ();
        p1.color = "blue";
        p1.type = "ball-point";

        p1.write();
        p1.printInfo();

        Pen p2 = new Pen ();
        p2.color = "red";
        p2.type = "gel";

        p2.write();
        p2.printInfo();


    }
}
