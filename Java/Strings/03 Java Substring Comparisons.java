import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int cur = 0;
        smallest = s.substring(cur, cur+k);
        largest = s.substring(cur, cur+k);
        while(cur+k <= s.length()){
            String curString = s.substring(cur, cur+k);
            if(smallest.compareToIgnoreCase(curString) >= 0)
                smallest = curString;
            else if(largest.compareToIgnoreCase(curString) < 0)
                largest = curString;
            cur++;
        }
        return smallest + "\n" + largest;
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}