import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        
        String[] splitS = s.split("[ !,?._'@]+");
        if(s.length() >0){
            System.out.println(splitS.length);
            for(String a : splitS)
                System.out.println(a);
        }else
            System.out.println(0);
            
        scan.close();
    }
}