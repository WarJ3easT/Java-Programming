package day43_00P_Encapsulation;

public class AccessModifiers {

    public static int publicVariable = 100;
    public static boolean defaultVariable;
    private static int privateVariable = 200;
  //  static int defaultVariable = 300;
    //default

    public static void main(String[] args) {

        System.out.println(privateVariable);
        System.out.println(defaultVariable);
        System.out.println(publicVariable);




    }



}
/*
interface A {
    public default int
}

 */

