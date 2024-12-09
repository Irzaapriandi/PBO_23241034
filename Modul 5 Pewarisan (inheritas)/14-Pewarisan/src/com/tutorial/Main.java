package com.tutorial;

// pewarisan adalah hubungan is-a
public class Main {
    public static void main(String[] args) {
        // membuat objek hero
        Hero hero1 = new Hero();
        hero1.name = "Alucard";
        hero1.cetak();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Tigreal";
        hero2.cetak();

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "Natalia";
        hero3.cetak();
    }

}
