package day27_Recap;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] array = new int[2];
        array = new int[4];
        array[0] = 10;
        array[1] = 20;

        array[2] = 30;
        array[3] = 40;

        System.out.println(Arrays.toString(array));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println( numbers.length );
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);

        // System.out.println(numbers[200]);

        for (int i = 0; i <= numbers.length-1; i++ ){
            System.out.print
                    (numbers[i]+" ");
        }







    }
}