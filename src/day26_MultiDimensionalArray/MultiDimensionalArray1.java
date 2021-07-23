package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray1 {

    public static void main(String[] args) {
        // index :         0 1 3     0 1     0 1 2
        int[][] arr2D = { {1,2,3} , {4,5} , {6,7,8} };
           // index:         0        1        2
        System.out.println(arr2D.length);

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]) );

        System.out.println(arr2D[1][1]);

        System.out.println("-----------------------------");

        for (int i = 0; i < arr2D.length; i++) { // index number of single dimensional arrays
           // int[] each1DArray = arr2D[i];
            System.out.println( Arrays.toString( arr2D[i]) );
            for (int j = 0; j < arr2D[i].length; j++){
                System.out.println(arr2D[i][j]);
            }

        }

        System.out.println("----------------------------------");

        for (int[] each1D : arr2D) {
            System.out.println( Arrays.toString(each1D) );
            for (int element : each1D){
                System.out.print(element+" ");
            }

            System.out.println();

        }



    }
}
