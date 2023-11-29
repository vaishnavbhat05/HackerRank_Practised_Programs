// Returns

// string: the string ' + "\n" + ' where and are the two substrings
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
// Explanation 0

// String  has the following lexicographically-ordered substrings of length :

// We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

// The stub code in the editor then prints ava as our first line of output and wel as our second line of output.

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
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
