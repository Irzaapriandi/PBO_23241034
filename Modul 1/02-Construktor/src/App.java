// class tanpa konstruktor "class polos"
class Polos {
    String dataString;
    int dataInteger;
}

//class dengan konstruktor
class Mahasiswa {
    //atribut
    String nama;
    String NIM;
    String prodi;

    // construktor nama sama dengan nama class
    // construktor di panggil saat object pertama kali dibuat
    // construkrot tidak mengembalikan nilai(tidak punya retun)

    //construktor
    Mahasiswa(String InputNama, String InputNIM, String Inputprodi){
        nama = InputNama;
        NIM = InputNIM;
        prodi = Inputprodi;

        // cetak

        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + prodi);
    }
}



public class App {
    public static void main(String[] args) throws Exception {

        // // instansiasi object class polos
        // Polos objecPolos = new Polos();

        // // pengisian data
        // objecPolos.dataString = "polos";
        // objecPolos.dataInteger = 10;

        // //cetak
        // System.out.println(objecPolos.dataString);
        // System.out.println(objecPolos.dataInteger);

        // instansiasi objek class mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("Ucup", "252262", "PTI");
        System.out.println("");
        Mahasiswa mhs_2 = new Mahasiswa("Otong", "64747478", "PTI");
    }
}
