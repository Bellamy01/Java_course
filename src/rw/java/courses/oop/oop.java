package rw.java.courses.oop;

public class oop {

    public static void main(String[] args){
        //method overloading allows creating one method with different parameters or data types

        //original
        int og = sumTwoNumbers(45,432);
        //different data types
        double type = sumTwoNumbers(34.2d,453.231d);
        //different parameters
        float param = sumTwoNumbers(34.3f,563.32f,53.32f);

        System.out.println("Original:"+og);
        System.out.println("Different data types: "+type);
        System.out.println("Different parameters: "+param);

    }

    public static int sumTwoNumbers(int x,int y){
        return x+y;
    }
    public static double sumTwoNumbers(double x,double y){
        return x+y;
    }
    public static float sumTwoNumbers(float x,float y,float z){
        return x+y+z;
    }
}
