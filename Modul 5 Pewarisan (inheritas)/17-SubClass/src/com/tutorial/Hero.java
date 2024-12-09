package com.tutorial;

public class Hero {
    // atribut
    String name;
    double defencePower;
    double attackPower;

    // constructor
    Hero(String name, double defencePower, double attackPower) {
        this.name = name;
        this.defencePower = defencePower;
        this.attackPower = attackPower;

    }

    // method
    void cetak() {
        System.out.println("\nName " + this.name);
        System.out.println("Attack Power " + this.attackPower);
        System.out.println("Defence Power " + this.defencePower);

    }
}
