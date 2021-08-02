package day38_CustomClass;

public class RectangleObjects {

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


    }
}
