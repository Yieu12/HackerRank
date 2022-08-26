import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usnf.format(payment);
        NumberFormat cnnf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = cnnf.format(payment);
        NumberFormat frnf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = frnf.format(payment);
        
        Locale INDIA = new Locale("en", "IN");
        NumberFormat innf = NumberFormat.getCurrencyInstance(INDIA);
        String india = innf.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}