package day38_CustomClass;

import java.util.Arrays;

public class RectangleObjects {


    public String toString() {
        return "RectangleObjects{}";
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        /*
        rectangle1.width = 30;
        rectangle1.length = 20;
         */
        rectangle1.setInfo(30,20);

        rectangle1.getInfo();

        System.out.println("---------------------------------");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(50,10);

        rectangle2.getInfo();

        System.out.println("-------------------");

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println("---------------");

        Rectangle[] arr = {rectangle1, rectangle2};

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(Arrays.toString(arr));










    }
}
