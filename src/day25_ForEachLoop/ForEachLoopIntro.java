package day25_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("-------------");

        for ( int eachNumber : numbers){
            System.out.println(eachNumber);
        }

        System.out.println("-------------");

        String[] names = {"Eren","Emir","Yunus","Yusuf"};

        for (String eachName : names){ // there is no index in for each loop
            System.out.println(eachName);
        }




    }
}
