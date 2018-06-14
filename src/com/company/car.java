package com.company;

public class car extends vehicle{


    private String color;
    private int speed;
    private String manufacturer;
    private String model;

    public car() {
        System.out.print(" a car created. ");
    }
    @Override
    public String start() {
        return color + " " + manufacturer + " is starting. ";//color + manufacturer
    }
    public String accell() {
        return model + " is accelerating ";
    }
    public String stop() {
        return " is stopping. ";
    }
    public int getspeed() {
        return speed;
    }
    public void setspeed(int speed) {
        this.speed = speed;
    }
    public void readspeed() {
        System.out.print(" this car is goin " + getspeed() + "mpg "); //ill show u easy??
    }
    public String getcolor() {
        return color;
    }
    public void setcolor(String color) { //String
        this.color = color;
    }
    public String getmanufacturer() {
        return manufacturer;
    }
    public void setmanufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String emission() {
        return manufacturer + color + " stopped to have its emission checked. ";
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String passed() {
        return color +"\t" + model + " just passed ";
    }
}
