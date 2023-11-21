// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

// Given a string , print Yes if it is a palindrome, print No otherwise.

// Constraints

//  will consist at most  lower case english letters.
// Sample Input

// madam
// Sample Output

// Yes

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        // Check if the input string is a palindrome
        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
     // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        // Remove non-alphanumeric characters
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        // Compare the string with its reverse
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
