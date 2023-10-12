package com.oops.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // ArrayList is not synchronized but comparatively faster than vector
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(78);
        list2.add(55);
        list2.add(89);

        System.out.println(list2);

        // Vectors are synchronized but comparatively slower than ArrayList
        // Suitable for multithreaded environments
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(15);

        System.out.println(vector);
    }
}
