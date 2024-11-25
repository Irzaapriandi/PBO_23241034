class Player {

    private String nama;
    // static variable
    private static int numberOfPlayer;

    // konstruktor
    Player(String nama) {
        this.nama = nama;
        Player.numberOfPlayer++;
    }

    // method static
    static void showNumberOfPlayer() {
        System.out.println("Number Of Player : " + Player.numberOfPlayer);
    }

    // method menampilkan nama player
    void show() {
        System.out.println("Player Nama : " + this.nama);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Ronaldo");
        Player player2 = new Player("Pogba");
        Player player3 = new Player("Maguire");
        Player player4 = new Player("Rahmat");

        Player.showNumberOfPlayer();
    }
}
