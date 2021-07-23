package day32_MethodOverLoadıng;

import java.util.Arrays;

public class WarmupTask {


    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int element = 10 ;

       array = addInteger(array,element);

        System.out.println(Arrays.toString(array));

    }







    public static int[] addInteger(int[] array, int number){
        int[] result = new int[array.length+1];
int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = number;
        return result;
    }

  public static double[] addDouble(double[] array ,double number){
        double[] result = Arrays.copyOf(array,array.length+1);

        result[result.length-1] = number;

        return result;
  }


  public static String[] addString(String[] array,String str){
        String[] result = Arrays.copyOf(array , array.length+1);
        result[result.length-1] = str;
        return result;
  }

  











}
