package rw.java.courses;

public class Loops {
    public static void main(String[] args){
            //while loop
            int i = 1;
            while(i <= 5){
                //block of code to be executed
                int k = 1;
                while(k<= i-1){
                    System.out.print("");
                    k++;
                }


                int j=5;
                while(j>=i){
                    System.out.print("*");
                    j--;
                }
                System.out.println();
                //increment/decrement here
                i++;
            }
            //do while loop
    }
}
