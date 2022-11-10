package rw.java.courses.oop;

public class Student {
    private String name;
    private char sex;
    private int age;

    public void Drinking(){
        System.out.println("I love to drink.");
    }
    public void Running(){
        System.out.println("I love to run.");
    }
    public void Eating(){
        System.out.println("I love to run.");
    }

    //default constructor
    // alt+insert

    //getters
    //return the variable value
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getSex(){
        return sex;
    }

    //setters
    //set the variable value
    public void setName(String newName){
        this.name = newName;
    }
    public void setSex(char newSex){
        this.sex = newSex;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }


    public Student(){
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
