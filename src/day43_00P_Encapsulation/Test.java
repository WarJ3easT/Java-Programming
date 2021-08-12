package day43_00P_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);

        EncapsulationIntro obj = new EncapsulationIntro();
       /*
        System.out.println(obj.username);
        System.out.println(obj.password);

        obj.username= "H";
        obj.password= "123";

        System.out.println(obj.username);
        System.out.println(obj.password);

        */

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setUsername("CybertekSchool");
        obj.setPassword("Cybertek123456");
    }
}
