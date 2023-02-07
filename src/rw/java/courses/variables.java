package rw.java.courses;
import rw.java.courses.oop.Student;

public class variables {
    //types of variables
    /*
            * local variables(non-static)
            * instance variables(non-static)
            * static variables(static)
     */
    //when a variable is called as static
    //a single variable is created and shared
    //among all objects at a class level

    public static void main(String[] args) {
        Student student = new Student("Bellamy", 'M', 36);
        Student s2 = new Student("Elana", 'F', 29);
        System.out.println("Student id:" + s2.getId());
    }
}
