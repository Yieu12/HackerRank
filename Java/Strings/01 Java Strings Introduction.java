import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        //length of both strings combined
        int total= A.length() + B.length();
        
        //checks if A is before B in the dictionary
        String first = "No";
        if(Character.toLowerCase(A.charAt(0)) > Character.toLowerCase(B.charAt(0)))
            first = "Yes";
        
        //capitalize first letter of A and B
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(total);
        System.out.println(first);
        System.out.println(A +" "+ B);
    }
}