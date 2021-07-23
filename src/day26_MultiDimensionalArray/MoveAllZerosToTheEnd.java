package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int[] array = {10,0,5,0,1,0,0,0,0,2,4,3,0,0};

        int[] result = new int[array.length];
        //             {10,5,1,0,0,0}
        int i = 0; // index number of the result

        for (int each : array) { //each: 10,0,5,0,1,0
            if (each != 0){ // 10,5,1
                result[i] = each;
                i++;
            }

        }

        System.out.println(Arrays.toString(result));



    }
}
