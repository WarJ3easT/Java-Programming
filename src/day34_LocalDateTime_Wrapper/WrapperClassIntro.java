package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {
        short s = 10;
        int num = s;

        Integer num2 = (int)s; // autoboxing

        char ch = '@';
        Character ch2 = (Character) ch;

        Byte b1 = 10;
        byte b2 = b1;
        short b3 = b1;
        int b4 = b1;
        long b5 = b1;
        float b6 = b1;
        double b7 = b1;

        System.out.println("------------------------------------");

        byte c1 = 10;

        Byte c2 = c1;
       /* Short c3 = c1;//wrapper class only accepts it's own primitive
        Integer c4 = c1;
        Long c5 = c1;
        Float c6 = c1;
        Double c7 = c1;

        */







    }
}
