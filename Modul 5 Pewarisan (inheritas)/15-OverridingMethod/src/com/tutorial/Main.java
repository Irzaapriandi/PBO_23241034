package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // buat objek
        Hero hero1 = new Hero();
        hero1.name = "Vexana";
        // hero1.defencePower = 10;
        hero1.cetak();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Saitama";
        hero2.defencePower = 999;
        hero2.cetak();
    }
}
