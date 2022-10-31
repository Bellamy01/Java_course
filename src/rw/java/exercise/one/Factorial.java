package rw.java.exercise.one;

// "author": "Dan Bellamy"

public class Factorial {
    public static void main(String[] args){
        //write a java program that calculates the factorial of 10
        int j = 1;
        for(int i = 10; i >=1;i-- ){
             j=j*i;
        }
        System.out.println("The factorial of 10 is "+ j);
    }
}
