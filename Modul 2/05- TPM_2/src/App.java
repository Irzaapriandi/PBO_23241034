class BangunDatar{
    double panjang;
    double lebar;
    double luas;
    double keliling;

    BangunDatar(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method tanpa parameter dan return
    void menghitungLuas(){
        luas = panjang * lebar;
        System.out.println("\n Luas : " + this.luas);
    }
    void menghitungKeliling(){
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling : " + this.keliling);
    }

    // method tanpa return dengan parameter
    void setPanjang(double panjang){
        this.panjang = panjang;
    }
    void setLebar(double lebar){
        this.lebar = lebar;
    }

    // method dengan return tanpa parameter
    double getLuas(){
        return this.luas;
    }
    double getKeliling(){
        return this.keliling;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        // Instansi objek
        BangunDatar bdr = new BangunDatar(9, 13);

        // memanggil method menghitungLuas & menghitungKeliling
        bdr.menghitungLuas();
        bdr.menghitungKeliling();

        // memanggil method setPanjang & setLebar
        bdr.setPanjang(5);
        bdr.setLebar(8);
        // cetak setelah ubah panjang dan lebar
        bdr.menghitungLuas();
        bdr.menghitungKeliling();

        // memanggil method getLuas & getKeliling
        double Luas = bdr.getLuas();
        double Keliling = bdr.getKeliling();
        System.out.println("\n Luas : " + Luas);
        System.out.println("Keliling : " + Keliling);

    }
}
