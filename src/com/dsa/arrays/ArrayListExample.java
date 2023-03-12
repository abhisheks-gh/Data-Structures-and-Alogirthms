/** ArrayList:
 * Resizable-array implementation of the List interface. Implements all optional list operations,
   and permits all elements, including null. In addition to implementing the List interface, this
   class provides methods to manipulate the size of the array that is used internally to store the
   list. (This class is roughly equivalent to Vector, except that it is unsynchronized.) */

/** Default initial capacity of ArrayList in java = 10
 * ArrayList increments 50% of current array size if the number of elements exceeds from its capacity.
 * Vector increments 100% means doubles the array size if the total number of elements exceeds than
   its capacity. */

/** ArrayList has O(1) time complexity to access elements via the get and set methods. */

package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax:
        // ArrayList<objectType> listName = new ArrayList<>();
        //                      OR
        // ArrayList<objectType> listName = new ArrayList<>(initialCapacity);
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(654);
//        list.add(8765);
//        System.out.println(list);
//
//        list.set(0, 99);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);
//
//        System.out.println(list.contains(654));

        // Input list
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // Output list
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}
