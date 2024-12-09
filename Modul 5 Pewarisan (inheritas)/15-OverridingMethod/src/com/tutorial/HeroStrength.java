package com.tutorial;

public class HeroStrength extends Hero {
    double defencePower;

    // overriding method
    void cetak() {
        System.out.println("\nHero Strength");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defence Power : " + this.defencePower);
    }
}
