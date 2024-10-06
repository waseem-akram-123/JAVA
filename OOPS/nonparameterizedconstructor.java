class Student {
    String name;
    int age;

    public void printInfo (){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student (){
        System.out.println("student is created");  // default constructor
    }
}

public class nonparameterizedconstructor {
    public static void main (String args[]){

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.printInfo();

    }
    
}
