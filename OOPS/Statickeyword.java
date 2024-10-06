class Student {
    String name;
    static String school;

    public static void changeSchool (){
        school = "new-school";
    }
}


public class Statickeyword {
    public static void main (String args []){

        Student.school = "Genius";

        Student s1 = new Student();
        s1.name = "waseem";

        System.out.println(s1.name);
        System.out.println(s1.school);

        s1.changeSchool();

        System.out.println(s1.school);

    }
}
