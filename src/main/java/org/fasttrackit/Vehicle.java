package org.fasttrackit;

public class Vehicle {

    public static int applicationTotalNUmberOfVehicles;

    private String name;
    private String color;
    private double mileage;
    private long totalKm;




    public double accelerate (double speed, double durationInHours) {
        System.out.println(name + "accelerated with" + speed +
                "km/h for" + durationInHours + "hours");

        double distance = speed * durationInHours;

        System.out.println("traveled distance + distance");

        return distance;
    }

    //method used just to demonstrate co-variant return types
    public Vehicle returnSomeVehicle() {
        return this;
    }


    //method overloading

    public double accelerate (double speed) {

        return accelerate(speed, 1);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }
}
