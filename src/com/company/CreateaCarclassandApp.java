package com.company;

public class CreateaCarclassandApp {

    public static void main(String[] args) {
	// write your code here
        car c = new car();
        c.setspeed(20);
        c.setcolor("gray");
        c.setmanufacturer("hondai");
        c.setModel("civic");

        System.out.print(c.start()); //1
        System.out.print(c.accell());//ell());3
        c.readspeed(); //4
        System.out.print(c.stop()); //2
        System.out.print(c.emission());

        car c2 = new car();
        c2.setspeed(30);//c
        c2.setcolor("white");
        c2.setmanufacturer("toyoda");
        c2.setModel("highlandar");

        System.out.println(c2.start());
        System.out.print(c2.accell());
        //System.out.print(c2.setspeed();)
        c2.readspeed();
        System.out.print(c2.stop());
        System.out.print(c.passed() + " \t"+ c2.getModel() + " wow!! ");//oasse c1
    }
}
