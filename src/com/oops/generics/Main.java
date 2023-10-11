package com.oops.generics;

public class Main implements GenericInterface<Integer> {

    @Override
    public void display(Integer value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.display(5);
    }
}
