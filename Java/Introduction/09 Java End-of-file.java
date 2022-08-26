import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int cur = 1;
        while(s.hasNext()){
            System.out.printf("%d %s\n", cur, s.nextLine());
            cur++;
        }
    }
}