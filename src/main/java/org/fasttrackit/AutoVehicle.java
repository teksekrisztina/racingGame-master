package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    Engine engine;
    boolean running;


    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    //constructor overloading

    public AutoVehicle() {
        this (new Engine ());

    }
}
