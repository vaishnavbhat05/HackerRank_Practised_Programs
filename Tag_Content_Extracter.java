// Input Format

// The first line of input contains a single integer,  (the number of lines).
// The  subsequent lines each contain a line of text.

// Constraints

// Each line contains a maximum of  printable characters.
// The total number of characters in all test cases will not exceed .
// Output Format

// For each line, print the content enclosed within valid tags.
// If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.

// Sample Input

// 4
// <h1>Nayeem loves counseling</h1>
// <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
// <Amee>safat codes like a ninja</amee>
// <SA premium>Imtiaz has a secret crush</SA premium>
// Sample Output

// Nayeem loves counseling
// Sanjay has no watch
// So wait for a while
// None
// Imtiaz has a secret crush

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {
            String line = in.nextLine();
            processLine(line);
        }
    }

    private static void processLine(String line) {
        // Write your code here
        String regex = "<(.+?)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group(2));
            found = true;
        }

        if (!found) {
            System.out.println("None");
        }
    }
}
