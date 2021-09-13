package com.company;

public class Animal {
    int paws;
    boolean hasTail;
    String colour;

    Animal(int paws, boolean hasTail, String colour){
        this.paws = paws;
        this.hasTail = hasTail;
        this.colour = colour;
    }

    void wash(){
        System.out.println("помылся");
    }
}
