package com.oops.properties.inheritance;

public class BoxWithWeight extends Box {
    double weight;

    public BoxWithWeight() {
        this.weight = -1;
    }

    BoxWithWeight(BoxWithWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWithWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWithWeight(double l, double h, double w, double weight) {
        super(l, h, w); // calls the parent class constructor
        // used to initialize values present in parent class

        //        System.out.println(super.weight);

        this.weight = weight;
    }
}
