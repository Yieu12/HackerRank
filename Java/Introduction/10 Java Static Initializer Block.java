import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int h = s.nextInt();
        if(b>0 && h>0)
            System.out.print(b*h);
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}