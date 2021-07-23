package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

       // int[] nums = {1,2,3};
       // int[][] nums = {{1,2,3} , {4,5}};
        int[][][] arr3D = { {{1,2,3},{4,5}} , {{6,7,8},{9,10}} };

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[0][1]));

        System.out.println(arr3D[1][0][2]);

        System.out.println("---------------------------------------");

        for (int[][] each2D : arr3D) { //for geting each 2 dimensional arrays form arr3D
            for (int[] each1D : each2D ){ // for geting each 2 dimansional arrays from arr2D
                for (int element : each1D){ // gor geting each 1 dimensional arrays from arr1D
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        System.out.println("-----------------------");

        int[][][] arr4D = { {{1,2,3},{4,5}} , {{6,7,8},{9,10}} };



    }
}
