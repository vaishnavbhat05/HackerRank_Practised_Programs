// Input Format

// The first line contains an integer, , the size of the array.
// The second line contains  space-separated integers that describe .

// Constraints



// Output Format

// Print the following  lines, each to  decimals:

// proportion of positive values
// proportion of negative values
// proportion of zeros
// Sample Input

// STDIN           Function
// -----           --------
// 6               arr[] size n = 6
// -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
// Sample Output

// 0.500000
// 0.333333
// 0.166667

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int n = arr.size();

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Calculate proportions
        double positiveProportion = (double) positiveCount / n;
        double negativeProportion = (double) negativeCount / n;
        double zeroProportion = (double) zeroCount / n;

        // Print the proportions with 6 decimal places
        System.out.printf("%.6f%n", positiveProportion);
        System.out.printf("%.6f%n", negativeProportion);
        System.out.printf("%.6f%n", zeroProportion);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
