package com.tutorial;

// keword import untuk panggil package tutorial
import com.terminal.Console;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("Goku");
        Player player3 = new Player("Madara");
        Player player4 = new Player("Kirito");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        Console.log("tes");
    }
}
