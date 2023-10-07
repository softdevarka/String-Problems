
//I/P - S1 = "ABCD"
//      S2 = "AD"
//
//O/P - True
//
//I/P - S1 = "ABCDE"
//      S2 = "AED"
//
//O/P - False

import java.util.Scanner;

public class StringSubsesquence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int n = s1.length();
        int m = s2.length();

        System.out.println(inSubseq(s1, s2, n, m));
    }
//Iterative Function
//    static boolean inSubseq (String s1, String s2, int n, int m){
//
//        if(n<m){
//            return false;
//        }
//        int j = 0;
//        for(int i=0; i<n && j<m; i++){
//            if(s1.charAt(i) == s2.charAt(j)){
//                j++;
//            }
//        }
//        return j==m;
//    }
//Time Complexity - O(n+m)
//Space Complexity - O(1)

// Recursive Function

    static boolean inSubseq (String s1, String s2, int n, int m){
        if(m==0){
            return true;
        }
        if(n==0){
            return true;
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return inSubseq(s1, s2, n-1, m-1);
        }
        else{
            return inSubseq(s1, s2, n-1, m);
        }
    }
//Time Complexity - O(n+m)
//Space Complexity - O(n+m)
}

//Comment out the function and try for iterative solution





