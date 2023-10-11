// https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
package com.oops.generics;

import java.util.Arrays;
import java.util.List;

// Here T should either be Number or its subclass
public class WildcardExample<T extends Number> { // <T> is the type parameter of this class

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    // Here, we can only pass the Number type
//    public void getList(List<Number> list) {
//        // do something
//    }

    // But if we want to pass Number and its subclass type as well, then do this way
    public void getList(List<? extends Number> list) {
        // do something
    }

    public void add(T num) {
        if (this.isFull()) {
            resize();
        }

        // When data will be inserted at 0th index, size will become 1
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        WildcardExample<Number> list = new WildcardExample<>();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list );

        list.remove(); // 14th element is still in the list but the new size is 13
        System.out.println(list); // 14th element will be overwritten when we will add new element
    }
}
