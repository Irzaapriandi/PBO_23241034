package com.tutorial;

// sub class
public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float luas() {
        return panjang * lebar;
    }

    public float keliling() {
        return (panjang + lebar)*2;
    }
}
