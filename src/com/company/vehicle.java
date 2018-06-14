package com.company;

public class vehicle {
    public int speed;

    public vehicle() {
        System.out.print("a vehicle has been created.");
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String start() { //starting
        return " is starting...";
    }
}
