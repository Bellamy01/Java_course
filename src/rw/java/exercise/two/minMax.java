package rw.java.exercise.two;

import java.util.Arrays;

public class minMax {
    //write a program that finds the max and min of an Array
    public static void main(String[] args){
        int[] arr = {25,1,23,53,63,37,758,585,8,3,352};
        int arrLen = arr.length;
        System.out.println("MIN AND MAX ELEMENTS IN AN ARRAY");
        System.out.println("Array: "+Arrays.toString(arr));
        minEl(arr,arrLen);
        maxEl(arr,arrLen);
    }
    public static void minEl(int[] arr, int arrLen){
        int minValue =arr[0];
        for(int i=1;i < arrLen;i++){
            if(arr[i]< minValue){
                minValue = arr[i];
            }
        }
            System.out.println("MIN VALUE: "+minValue);
    }
    public static void maxEl(int[] arr, int arrLen){
        int maxValue =arr[0];
        for(int i=1;i<arrLen;i++){
            if(arr[i]> maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("MAX VALUE: "+maxValue);
    }
}
