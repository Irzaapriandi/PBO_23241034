package com.tutorial;

import com.terminal.Console;
import java.io.Console;

// visibiliti default
// hanya bisa di akses oleh package sama
class Player {
    private String nama;
    public static int jumlahPlayer;

    Player(String nama){
        this.nama= nama;
    }

    void cetak(){
        Console.log("Menggunakan Console");
        Console.log("Player Nama : " + this.nama);
    }
}
