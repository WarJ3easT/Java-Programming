package day27_Recap;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "aaabccddefggggh";
        // indexOf('a') ==> 0
        // lastIndexOf('a') ==> 2

        for ( char each : str.replace(" ","").toCharArray() ){
            if (str.indexOf(each) == str.lastIndexOf(each)){
                System.out.print(each);
                break;
            }
        }


    }
}
