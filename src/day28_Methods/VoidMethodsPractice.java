package day28_Methods;

import java.util.Scanner;

public class VoidMethodsPractice {

    public static void main(String[] args) {

       /*Scanner scan = new Scanner(System.in);
         System.out.print("Enter Two Numbers: ");
         printOddNumber(scan.nextInt(),scan.nextInt());
         System.out.println("Odd Numbers");

        */

        printOddNumber(10,20);

        System.out.println("-------------------");

        printEvenNumber(10,20);

        /* System.out.print("Enter two numbers");
           printEvenNumber(scan.nextInt(),scan.nextInt());
           System.out.println("Even Numbers");

         */
        System.out.println("-----------------");

        calculateAge(2004,2021);

        System.out.println("-----------------------");

        eligibleToVote(23,true);

        System.out.println("----------------------");

        calculate(20,'/',2);


    }









    public static void printOddNumber(int from , int to){

        for (int i = from; i <= to; i++) {
            if ( i % 2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumber(int from,int to){

        for (int i = from; i <= to; i++){
            if (i % 2 == 0){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void calculateAge(int birthYear,int currentYear){
        System.out.println("Your age is : "+(currentYear - birthYear));
    }

    public static void eligibleToVote(int age , boolean isUScCitizen){

        if (age >= 21 && isUScCitizen){
            System.out.println("You Are Eligible To Vote");
        }else{
            System.out.println("You Are Not Eligible To Vote");
        }
    }

    public static void calculate(int num1 , char operator , int num2){

        switch (operator){
            case '-':
                System.out.println("Subtraction: " + (num1-num2));
                break;

            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;
        }
    }




}
