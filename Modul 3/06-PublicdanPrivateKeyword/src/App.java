class Data{
    // Data member atau variabel instant
    String nama; // default, bisa dikases diluar kelass
    public String prodi; // public, bisa diakses diluar kelas
    private Double ipk; // private, hanya bisa diakses oleh class itu sendiri

    // Konstruktor
    Data(String nama, String prodi, Double ipk){
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    // default modifier access method
    void cetakData(){
        tambahIPK(); // contoh akses private method
        System.out.println("Nama : " + this.nama);
        System.out.println("Podi : " + this.prodi);
        System.out.println("IPK : " + this.ipk);
    }

    // public modifier access method
    public void ubahNama(String namaBaru){
        this.nama = namaBaru;
    }

    // private modifier access method
    private void tambahIPK(){
        this.ipk += 0.5;
    }
}





public class App {
    public static void main(String[] args) throws Exception {
        // Instansiasi objek
        Data data1 = new Data("Yogi", "PTI", 3.14);

        // Modifier access default
        System.out.println(data1.nama);
        data1.nama = "Maulana";
        System.out.println(data1.nama);

        //Modifier access public
        System.out.println(data1.prodi);
        data1.prodi = "Sipil";
        System.out.println(data1.prodi);

        // modifier access private
        // System.out.println(data1.ipk);
        // data1.ipk = 3.0;
        // System.out.println(data1.ipk);
        
        // Method default
        data1.cetakData();

        // method public
        data1.ubahNama("Ihsan");
        data1.cetakData();

        // // method private
        // data1.tambahIPK();
    }
}
