package com.terminal;

// visibilitasnya bisa diakses oleh package eksternal
public class Console {
    public static void log(String pesan) {
        System.out.println(pesan);
    }
}

// ini hanya bisa diakses dari package com.terminal
class Terminal{
    public static void log(String pesan) {
        System.out.println(pesan);
    }
}
