package com.tutorial;

public class Player {
    // atribut
    private String name;
    // atribut static
    private static int jumlahPlayer;

    // constructor
    // opsi 1
    Player(String name) {
        Player.jumlahPlayer++;
        this.name = name;
    }

    // overloading constuctor
    // opsi 2
    Player() {
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    // cetak
    void cetak() {
        System.out.println("Nama : " + this.name);

    }
}
