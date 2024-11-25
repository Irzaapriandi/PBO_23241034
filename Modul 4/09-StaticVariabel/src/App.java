class Display {
    // objek variabel
    String nama;

    // static variabel
    static String tipe = "Display";

    // konstruktor
    Display(String nama) {
        this.nama = nama;
    }

    // setter
    void setTipe(String tipeInput) {
        // tipe = tipeInput; // cara 1
        // this.tipe = tipeInput; // cara 2
        Display.tipe = tipeInput; // cara 3
    }

    // method
    void cetak() {
        System.out.println("Display nama : " + this.nama);

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Display display1 = new Display("Monitor");
        display1.cetak();

        Display display2 = new Display("TV");
        display2.cetak();

        // menampilkan static variabel atau class variabel
        System.out.println("Menampilkan Static Variabel");
        System.out.println(display1.tipe); // diakses oleh objek
        System.out.println(Display.tipe); // diakses oleh class

        // coba ganti isi static variabel
        Display.tipe = "Spanduk";
        // display1.tipe = "Smartphone";
        System.out.println(display1.tipe);
        System.out.println(display2.tipe);
        System.out.println(Display.tipe);

        // pakai setter untuk mengganti variabel static
        display1.setTipe("Monitor");
        System.out.println("Objek1 : " + display1.tipe);
        System.out.println("Objek2 : " + display2.tipe);
        System.out.println("Class : " + Display.tipe);

    }
}
