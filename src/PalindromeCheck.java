//Brute-Force Approach
//Time Complexity - O(n) , Space Complexity - O(n)
import java.util.Scanner;

//public class PalindromeCheck {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        System.out.println(isPal(str));
//    }
//
//    static boolean isPal(String str){
//        StringBuilder rev = new StringBuilder(str);
//
//        rev.reverse();
//
//        return str.equals(rev.toString());
//    }
//}


// Optimized Approach
//Time Complexity - O(n) , Space Complexity - O(1)
class PalindromeCheck2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalCheck(str));
    }

    static boolean isPalCheck (String str) {
        int begin = 0;
        int end = str.length() - 1;

        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

}

//Comment Out and try the both naive and efficient approach.