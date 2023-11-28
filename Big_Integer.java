// In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

// Use the power of Java's BigInteger class and solve this problem.

// Input Format

// There will be two lines containing two numbers,  and .

// Constraints

//  and  are non-negative integers and can have maximum  digits.

// Output Format

// Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

// Sample Input

// 1234
// 20
// Sample Output

// 1254
// 24680
// Explanation

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Read the input numbers as strings
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        // Create BigInteger objects from the input strings
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);

        // Perform addition and multiplication
        BigInteger sum = bigNum1.add(bigNum2);
        BigInteger product = bigNum1.multiply(bigNum2);

        // Print the results
        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}


