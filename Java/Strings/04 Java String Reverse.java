import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder rev = new StringBuilder(A);
        String reversed = rev.reverse().toString();
        if(A.compareToIgnoreCase(reversed) == 0)
            System.out.print("Yes");
        else   
            System.out.print("No");
    }
}