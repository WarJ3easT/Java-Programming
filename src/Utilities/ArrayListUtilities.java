package Utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtilities {


    public static void main(String[] args) {

        int[] nums = new int[10]; // size 10 fixed
        System.out.println(Arrays.toString(nums));

        ArrayList<Integer> numbers = new ArrayList<Integer>(); // size is 0
        numbers.add(  10  );
        numbers.add(0,20);
        numbers.add(  30  );
        numbers.add(  40  );
        numbers.add(15);
        numbers.add(20);

        System.out.println(numbers);
        System.out.println( numbers.get(2) );

        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer each : numbers){
            System.out.println(each);
        }




    }
}
