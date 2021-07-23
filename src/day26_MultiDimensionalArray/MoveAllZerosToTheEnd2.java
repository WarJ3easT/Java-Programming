package day26_MultiDimensionalArray;

public class MoveAllZerosToTheEnd2 {

    public static void main(String[] args) {

        int[] array = {10,0,5,0,1,0};

        int[] result = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++) {
            if ( array[i] != 0 ){
                result[j] = array[i];
                j++; // after initializing the index, go to the next intex
            }

        }


    }
}
