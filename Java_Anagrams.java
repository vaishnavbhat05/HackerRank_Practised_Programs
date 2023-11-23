// Function Description

// Complete the isAnagram function in the editor.

// isAnagram has the following parameters:

// string a: the first string
// string b: the second string
// Returns

// boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
// Input Format

// The first line contains a string .
// The second line contains a string .

// Constraints

// Strings  and  consist of English alphabetic characters.
// The comparison should NOT be case sensitive.
// Sample Input 0

// anagram
// margana
// Sample Output 0

// Anagrams

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        // Check if lengths are equal
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Count character frequencies
        int[] charCount = new int[26]; // Assuming only English alphabetic characters
        for (char ch : a.toCharArray()) {
            charCount[ch - 'a']++;
        }

        // Decrement counts for characters in the second string
        for (char ch : b.toCharArray()) {
            charCount[ch - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
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
