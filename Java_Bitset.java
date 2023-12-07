// Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

// Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

// Input Format

// The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively.
// The  subsequent lines each contain an operation in one of the following forms:

// AND 
// OR 
// XOR 
// FLIP
// SET 
// In the list above,  is the integer  or , where  denotes  and  denotes .
//  is an integer denoting a bit's index in the BitSet corresponding to .

// For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

// AND 2 1
//  is the left operand, and  is the right operand. This operation should assign the result of  to .

// Constraints

// Output Format

// After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.

// Sample Input

// 5 4
// AND 1 2
// SET 1 4
// FLIP 2 2
// OR 2 1
// Sample Output

// 0 0
// 1 0
// 1 1
// 1 2

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();

            switch (operation) {
                case "AND":
                    if (operand1 == 1) {
                        bitSet1.and(bitSet2);
                    } else {
                        bitSet2.and(bitSet1);
                    }
                    break;

                case "OR":
                    if (operand1 == 1) {
                        bitSet1.or(bitSet2);
                    } else {
                        bitSet2.or(bitSet1);
                    }
                    break;

                case "XOR":
                    if (operand1 == 1) {
                        bitSet1.xor(bitSet2);
                    } else {
                        bitSet2.xor(bitSet1);
                    }
                    break;

                case "FLIP":
                    if (operand1 == 1) {
                        bitSet1.flip(operand2);
                    } else {
                        bitSet2.flip(operand2);
                    }
                    break;

                case "SET":
                    if (operand1 == 1) {
                        bitSet1.set(operand2);
                    } else {
                        bitSet2.set(operand2);
                    }
                    break;

                default:
                    break;
            }

            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }

        scanner.close();
    }
}
