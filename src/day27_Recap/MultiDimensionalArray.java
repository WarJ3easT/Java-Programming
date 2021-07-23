package day27_Recap;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] scrum1 = {"Emir","Alp"};
        String[] scrum2 = {"Eren","Kerem",};
        String[] scrum3 = {"Fenasi","Kerim"};

        String[][] scrumTeams = { scrum1 , scrum2 ,scrum3 };// length: 3

        System.out.println(Arrays.deepToString(scrumTeams));
        System.out.println( Arrays.toString(scrumTeams[0]) );
        System.out.println( scrumTeams[1][1]);

        System.out.println("------------------------------");

        for (String[] eachScrum : scrumTeams) {
            for ( String eachMembers : eachScrum){
                System.out.print(eachMembers+" ");
            }
        }

        System.out.println("\n-----------------------------");

        for (int i = 0; i < scrumTeams.length; i++){
            for (int j = 0; j < scrumTeams[i].length; j++) {
                System.out.println(scrumTeams[i][j]+" ");
            }
        }

        System.out.println("-------------------------------");

        int[] numbers = {1,2,3,4,5};
        int temp = numbers[0];
        numbers[0] = numbers[4];

        numbers[4] = temp;

        System.out.println(Arrays.toString(numbers));



    }
}
