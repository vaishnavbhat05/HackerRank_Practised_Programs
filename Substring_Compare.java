// Input Format

// The first line contains a string denoting .
// The second line contains an integer denoting .

// Constraints

//  consists of English alphabetic letters only (i.e., [a-zA-Z]).
// Sample Input 0

// welcometojava
// 3
// Sample Output 0

// ava
// wel

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        // Initialize smallest and largest with the first substring of length k
        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        // Iterate through all possible substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            // Compare with current smallest and largest substrings
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        
        return smallest + "\n" + largest;
    }

