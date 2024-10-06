class Student {
    String name;
    int age;

    Student (){
        System.out.println("student is created");  // default constructor
    }

    Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo (){
        System.out.println(this.name +" "+ this.age);
    }
}

public class ConstructorOverloading {
    public static void main (String args[]){

        Student s1 = new Student();

        Student s2 = new Student("aman", 24);
        s2.printInfo();

    }
}
