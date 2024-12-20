package com.tutorial;

// sub class
public class Lingkaran extends BangunDatar {
    float r;

    Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return (float) (Math.PI * r * r);

    }

    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
