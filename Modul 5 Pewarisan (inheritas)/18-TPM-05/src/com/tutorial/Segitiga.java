package com.tutorial;

// sub class
public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return (alas * tinggi) / 2;
    }

    public float keliling() {
        return 3 * alas;// untuk segitiga sama sisi
    }

}
