package com.oops.interfaces;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//        Engine car = new Car();

        // Can't access a Car member using an Engine reference type even the object is of Car type
//        int n = car.a;

//        car.accelerate();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
