package rw.java.exercise.two;

import java.util.Scanner;

public class lspncStr {
    public static void main(String[] args){
        //write a java program that calculates the letters,spaces,numbers and characters of an input string.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine();

        //string to char[]
        char[] chars =line.toCharArray();
        //char check - space,letter or number
        int spaces =0,letters = 0,numbers = 0,unknown = 0;

        for(int i =0; i < chars.length;i++){
            if(Character.isDigit(chars[i])){
                numbers++;
            }else if(Character.isLetter(chars[i])){
                letters++;
            }else if(Character.isSpaceChar(chars[i])){
                spaces++;
            }else{
                unknown++;
            }
        }
        System.out.println();
        System.out.println("Properties of the String");
        System.out.println();
        System.out.println("spaces: "+ spaces);
        System.out.println("letters: "+letters);
        System.out.println("Digits: "+numbers);
        System.out.println("Unknowns(Symbols,...): "+unknown);

    }
}
