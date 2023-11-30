// Input Format

// The first line contains a single integer, , denoting the length of array .
// The second line contains  space-separated integers describing each respective element, , in array .

// Constraints

// Output Format

// Print the number of subarrays of  having negative sums.

// Sample Input

// 5
// 1 -2 4 -5 1
// Sample Output

// 9
// Explanation

// There are nine negative subarrays of :

// Thus, we print  on a new line.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int countNegativeSubarrays = countNegativeSubarrays(arr);
        System.out.println(countNegativeSubarrays);
    }

    static int countNegativeSubarrays(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
