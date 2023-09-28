/** Singleton class means that we can make only one object of that class.
 * To achieve this, we need to stop people from using the constructor of this class.
 * So, make the constructor private. */

package com.oops.singleton;

public class Singleton {

    private static Singleton instance;

    // Constructor
    private Singleton() {

    }

    public static Singleton getInstance() {
        // check whether 1 object is already created or not
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
