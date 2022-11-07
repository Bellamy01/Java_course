package rw.java.exercise.two;

import java.util.Arrays;
import java.util.Scanner;

public class revStr {
    public static void main(String[] args){
        //write a java program that reverses a string
        Scanner scanner = new Scanner(System.in);

        System.out.println("REVERSE OF A STRING");
        System.out.print("Input a string of your choice: ");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        String revWord = "";
        int arrLen = chars.length;


        for(int i= arrLen-1;i>=0;i--){
            revWord += chars[i];
        }

        System.out.println("ORIGINAL STRING: "+line);
        System.out.println("REVERSED STRING: "+revWord);
    }
}
