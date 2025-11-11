package Constructor;

public class Student {
    String name;
    int age;
    Student()
    {
        name="Bhaskar Thapa";
        age=10;
    }
    public static void main(String[] args){
        Student s1=new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
