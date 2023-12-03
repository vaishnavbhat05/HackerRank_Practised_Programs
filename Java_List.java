// For this problem, we have  types of queries you can perform on a List:

// Insert  at index :

// Insert
// x y
// Delete the element at index :

// Delete
// x
// Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

// Input Format

// The first line contains an integer,  (the initial number of elements in ).
// The second line contains  space-separated integers describing .
// The third line contains an integer,  (the number of queries).
// The  subsequent lines describe the queries, and each query is described over two lines:

// If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
// If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
// Constraints



// Each element in is a 32-bit integer.
// Output Format

// Print the updated list  as a single line of space-separated integers.

// Sample Input

// 5
// 12 0 1 78 12
// 2
// Insert
// 5 23
// Delete
// 0
// Sample Output

// 0 1 78 12 23
// Explanation


//  Insert 23 at index .

//  Delete the element at index .

// Having performed all  queries, we print  as a single line of space-separated integers.

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial number of elements in the list
        int n = scanner.nextInt();

        // Read the initial list of integers
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Read the number of queries
        int q = scanner.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {
            String operation = scanner.next();

            if (operation.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                insertElement(list, index, value);
            } else if (operation.equals("Delete")) {
                int index = scanner.nextInt();
                deleteElement(list, index);
            }
        }

        // Print the updated list
        for (int num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Function to insert an element at a specified index in the list
    private static void insertElement(List<Integer> list, int index, int value) {
        list.add(index, value);
    }

    // Function to delete an element at a specified index from the list
    private static void deleteElement(List<Integer> list, int index) {
        list.remove(index);
    }
}
