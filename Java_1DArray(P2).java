// Input Format

// The first line contains an integer, , denoting the number of queries (i.e., function calls).
// The  subsequent lines describe each query over two lines:

// The first line contains two space-separated integers describing the respective values of  and .
// The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .
// Constraints

// It is guaranteed that the value of  is always .
// Sample Input

// STDIN           Function
// -----           --------
// 4               q = 4 (number of queries)
// 5 3             game[] size n = 5, leap = 3 (first query)
// 0 0 0 0 0       game = [0, 0, 0, 0, 0]
// 6 5             game[] size n = 6, leap = 5 (second query)
// 0 0 0 1 1 1     . . .
// 6 3
// 0 0 1 1 1 0
// 3 1
// 0 1 0
// Sample Output

// YES
// YES
// NO
// NO

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
    return canWinFromPosition(leap, game, 0);
    }

    private static boolean canWinFromPosition(int leap, int[] game, int currentPosition) {
        if (currentPosition < 0 || game[currentPosition] == 1) {
            return false;
        } else if (currentPosition == game.length - 1 || currentPosition + leap >= game.length) {
            return true;
        }

        game[currentPosition] = 1; // Mark the current position as visited

        return canWinFromPosition(leap, game, currentPosition + 1) ||
               canWinFromPosition(leap, game, currentPosition + leap) ||
               canWinFromPosition(leap, game, currentPosition - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
