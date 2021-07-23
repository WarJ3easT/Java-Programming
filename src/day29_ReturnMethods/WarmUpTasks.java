package day29_ReturnMethods;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        posNegZero(10);

        System.out.println("-------------------");

        int[] numbers = {10 , 20 , 0 , -30 , -5};

        for (int number : numbers) {
            posNegZero(number);




        }

        }




    public static void posNegZero(int number){

        if (number > 0){
            System.out.println(number +" is Positive Number");
        }else if (number < 0){
            System.out.println(number +" is Negative Number");
        }else {
            System.out.println(number +" is Zero Number");
        }

    }

    public static void mergeTwoArrays(int[] arr1 , int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));

    }

    public static void formatFullName(String firstName , String lastName){

     firstName =   firstName.substring(0 ,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName =   firstName.substring(0 ,1).toUpperCase() + firstName.substring(1).toLowerCase();

        String fullName = firstName+" "+lastName;

        System.out.println("Full name : "+ fullName);


    }

    public static void printMaxNumber(int num1 , int num2){
        System.out.println( (num1 > num2 ? num1 : num2) + " is maximum number.");

    }

    public static void printInDescending(int[] arr){
        Arrays.sort(arr);
        int[] result = new int[arr.length];

        for (int i = arr.length-1, j = 0; i >= 0 ; i++) {
           result[j] = arr[i];
            System.out.println(Arrays.toString(result));
        }

    }

}
