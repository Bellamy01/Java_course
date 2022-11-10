package rw.java.courses.oop;

public class main {
    public static void main(String[] args){
        //empty constructor
        Student student1 = new Student();
        //full-state constructor
        Student student = new Student("Bellamy",'M',18);
        //getter and setter
        System.out.println(student.getSex());
        student.setAge(20);
        student.setName("Daniel");
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
