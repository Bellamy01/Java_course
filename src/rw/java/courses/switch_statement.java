package rw.java.courses;

public class switch_statement{
    public static void main(String[] args){
        int i = 50;
        switch(i) {
            case 10:
                System.out.println("Incoming object");
                break;
            case 50:
                System.out.println("Object detected in close range");
                break;
            case 90:
                System.out.println("No object detected from close range");
                break;
            default:
                System.out.println("Out of range");
        }
    }
}
