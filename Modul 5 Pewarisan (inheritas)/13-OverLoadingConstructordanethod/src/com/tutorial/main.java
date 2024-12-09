package com.tutorial;

public class main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("Senku");
        Player player2 = new Player(); // overloading
        Player player3 = new Player(); // overloading
        Player player4 = new Player("Saitama");

        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
    }
}