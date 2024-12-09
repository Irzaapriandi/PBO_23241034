package com.tutorial;

//this.name itu akan mengakses atribut dalam class ini
//jika tidak ditemukan maka akses ke superclass

//super.name akan mengakses atribut di superclass
public class HeroStrength extends Hero {
    String name = "Class HeroStrength";

    // overriding
    void cetak() {
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
        super.dummyMethod();
    }

    // overriding method dummy
    void dummyMethod() {
        System.out.println("Ini adalah method Subclass");
    }
}
