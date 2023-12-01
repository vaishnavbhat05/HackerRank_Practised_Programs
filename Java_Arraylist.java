// Input Format
// The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

// Constraints

// Each number will fit in signed integer.
// Total number of integers in  lines will not cross .

// Output Format
// In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

// Sample Input

// 5
// 5 41 77 74 22 44
// 1 12
// 4 37 34 36 52
// 0
// 3 20 22 33
// 5
// 1 3
// 3 4
// 3 1
// 4 3
// 5 5
// Sample Output

// 74
// 52
// 37
// ERROR!
// ERROR!

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<List<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int lineSize = scanner.nextInt();
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < lineSize; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                int result = lines.get(x - 1).get(y - 1);
                System.out.println(result);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
