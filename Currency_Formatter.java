// Input Format

// A single double-precision number denoting .

// Constraints

// Output Format

// On the first line, print US: u where  is  formatted for US currency.
// On the second line, print India: i where  is  formatted for Indian currency.
// On the third line, print China: c where  is  formatted for Chinese currency.
// On the fourth line, print France: f, where  is  formatted for French currency.

// Sample Input

// 12324.134
// Sample Output

// US: $12,324.13
// India: Rs.12,324.13
// China: ￥12,324.13
// France: 12 324,13 €

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
        
        // Format currency for US
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        // Format currency for India
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = indiaFormat.format(payment);

        // Format currency for China
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        // Format currency for France
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
