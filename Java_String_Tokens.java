// Input Format

// A single string, .

// Constraints

//  is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
// Output Format

// On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

// Sample Input

// He is a very very good boy, isn't he?
// Sample Output

// 10
// He
// is
// a
// very
// very
// good
// boy
// isn
// t
// he

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        // Create a StringTokenizer with the specified delimiters
        StringTokenizer tokenizer = new StringTokenizer(s, " ,!?'._@");

        // Print the number of tokens
        System.out.println(tokenizer.countTokens());

        // Print each token on a new line
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        scan.close();
    }
}
