import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int cur = 1;
            int total = a;
            for(int j=0;j<n;j++){
                total = total + cur * b;
                System.out.print(total+" ");
                cur = cur * 2;
            }
            System.out.println();
        }
        in.close();
    }
}