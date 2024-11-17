class Hitung_Gaji_Bersih {
    private int gaji_pokok;
    private int tunjangan;
    private double pajak;

    void setGajiPokok(int gajiPokok) {
        this.gaji_pokok = gajiPokok;
    }

    public int getGajiPokok() {
        return this.gaji_pokok;
    }

    void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return this.tunjangan;
    }

    void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double getPajak() {
        return ((this.gaji_pokok + this.tunjangan) * pajak) / 100;
    }

    // method untuk mencetak gaji bersih
    public void cetakGajiBersih() {
        double Pajak = getPajak();
        double gajiBersih = ((this.gaji_pokok + this.tunjangan) - Pajak);
        System.out.println("Jadi Gaji Bersihnya adalah : Rp." + gajiBersih);
    }

}

public class App {
    public static void main(String[] args) {
        // instansiasi objek
        Hitung_Gaji_Bersih hgb = new Hitung_Gaji_Bersih();

        // tulis saja (setter) dari setGajiPokok, setTunjangan, setPajak
        hgb.setGajiPokok(500000);
        hgb.setTunjangan(250000);
        hgb.setPajak(5);

        // cetak gaji bersih
        hgb.cetakGajiBersih();
    }

}
