/** Polymorphism:
 * Ability to take multiple forms. */

package com.oops.properties.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
//        Square square = new Square();

//        shape.area();   circle.area();  square.area();

        Shapes square = new Square();
        square.area();
    }
}
