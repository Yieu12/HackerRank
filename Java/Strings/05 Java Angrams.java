import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
            return false;
        char letters[] = a.toCharArray();
        char letters2[] = b.toCharArray();
        letters = sortChar(letters);
        letters2 = sortChar(letters2);
        for(int i=0; i<a.length(); i++){
            if(Character.toLowerCase(letters[i]) != Character.toLowerCase(letters2[i]))
                return false;
        }
        return true;
    }
    
    public static char[] sortChar(char[] letter){
        for(int i=0; i<letter.length-1; i++){
            for(int j=i+1; j<letter.length; j++){
                if(Character.toLowerCase(letter[i]) > Character.toLowerCase(letter[j])){
                    char sortingC = Character.toLowerCase(letter[i]);
                    letter[i] = Character.toLowerCase(letter[j]);
                    letter[j] = sortingC;
                }
            }
        }
        return letter;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}