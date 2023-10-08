package com.oops.accessControl;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // Gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // Gets called when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        // Hashcode: Unique representation of an object via a number.
        // NOTE: Hashcode is not the address.
//        ObjectDemo obj1 = new ObjectDemo(34);
//        ObjectDemo obj2 = new ObjectDemo(34);
//        System.out.println(obj1.hashCode()); // These two will print different hash values for 34
//        System.out.println(obj2.hashCode()); // because hash value is unique for all objects.

        ObjectDemo obj1 = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);

        if (obj1 == obj2) { // == will check whether these 2 variables are pointing to the same object or not
            System.out.println("obj1 is equal to obj2");
        }

        if (obj1.equals(obj2)) { // .equals() will check the content of it (check we have overridden its definition)
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass()); // returns a class object that will be stored in heap
        System.out.println(obj1.getClass().getName());
    }
}
