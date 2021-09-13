package com.company;

public class Kot extends Animal{

    String eyeColor;
    double weight;
    double lengthWool;

    Kot(int paws, boolean hasTail, String colour,String eyeColor,double weight,double lengthWool) {
        super(paws, hasTail, colour);
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.lengthWool = lengthWool;
    }

    void haircut (double lengthWool, double cm){
        System.out.println(lengthWool-cm);
    }
}
