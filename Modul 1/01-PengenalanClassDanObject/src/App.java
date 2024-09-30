// Membuat class sebagai template
class Mahasiswa{
    // ciri-ciri atau atribut object
    String nama;
    String NIM;
    String jurusan;
    Double IPK;
    int umur;
}

public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi object
        Mahasiswa mhs_1 = new Mahasiswa();
        mhs_1.nama = "Ucup";
        mhs_1.NIM = "123456";
        mhs_1.jurusan = "PTI";
        mhs_1.IPK = 2.21;
        mhs_1.umur = 17;

        // cetak objeck
        System.out.println("Nama Mahasiswa : " + mhs_1.nama);
        System.out.println("NIM : " + mhs_1.NIM);
        System.out.println("Jurusan : " + mhs_1.jurusan);
        System.out.println("IPK : " + mhs_1.IPK);
        System.out.println("Umur : " + mhs_1.umur);

        System.out.println(" ");
        //calss 2
        Mahasiswa mhs_2 = new Mahasiswa();
        mhs_2.nama = "boby";
        mhs_2.NIM = "28278272";
        mhs_2.jurusan = "PTI";
        mhs_2.IPK = 4.0;
        mhs_2.umur = 17;

        // cetak objeck
        System.out.println("Nama Mahasiswa : " + mhs_2.nama);
        System.out.println("NIM : " + mhs_2.NIM);
        System.out.println("Jurusan : " + mhs_2.jurusan);
        System.out.println("IPK : " + mhs_2.IPK);
        System.out.println("Umur : " + mhs_2.umur);
    }
}
