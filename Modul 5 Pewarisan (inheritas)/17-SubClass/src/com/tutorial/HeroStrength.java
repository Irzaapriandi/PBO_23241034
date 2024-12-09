package com.tutorial;

public class HeroStrength extends Hero {
    String atribut = "Strength";

    // subclass constructor
    HeroStrength(String name, double defence, double attack) {
        super(name, defence, attack);
    }

    // overriding cetak
    void cetak() {
        System.out.println("Hero : " + this.atribut);
        super.cetak();
    }
}
