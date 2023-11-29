// Input Format

// The first line contains a single integer, , denoting the size of the array.
// Each line  of the  subsequent lines contains a single integer denoting the value of element .

// Output Format

// You are not responsible for printing any output to stdout. Locked code in the editor loops through array  and prints each sequential element on a new line.

// Sample Input

// 5
// 10
// 20
// 30
// 40
// 50
// Sample Output

// 10
// 20
// 30
// 40
// 50
// Explanation

// When we save each integer to its corresponding index in , we get . The locked code prints each array element on a new line from left to right.

import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Declare and initialize the array
        int[] a = new int[n];

        // Read the values for the array elements
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
