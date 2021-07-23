package day29_ReturnMethods;

public class ReturnMethods {

    public static void main(String[] args) {

        String str = "Java";

        String reverseStr = reverse(str);

      boolean Palindrome =  isPalindrome(str);

        System.out.println(Palindrome);

    }

    public static String reverse(String str){
        String result = "";//CBA

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str){
        String reversedStr = reverse(str);

        return (reversedStr.equalsIgnoreCase(str)) ? true : false ;
        }



}

