package rw.java.courses;

import java.util.Scanner;

public class strings {

    public static void main(String[] args){

        arr();
    }

    public static void arr(){
        //multi-dimensional array
        int[][][] anArr= { { {1,2},{3,4},{5,6} },{ {7,8},{9,10},{11,12} },{ {13,14},{15,16},{17,18} },{ {19,20},{21,22},{23,24} } };

            //i for rows
            //j for columns

        for(int i =0;i < 4;i++){
            for(int j=0; j < 3;j++){
                System.out.print("{");
                for(int k=0;k < 2;k++){
                    if(k ==1){
                        System.out.print(anArr[i][j][k]);
                    }else {
                        System.out.print(anArr[i][j][k] + ",");
                    }
                }
                System.out.print("}");
            }
            System.out.println();
        }
    }

    public static void ascii(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter:");
        int c = scanner.next().charAt(0);

        System.out.println("The ascii value of letter "+c);
    }

    public void print(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        for(int i=0;i < word.length();i++){
            char l = word.charAt(i);
            System.out.println(l);
        }
    }
}
