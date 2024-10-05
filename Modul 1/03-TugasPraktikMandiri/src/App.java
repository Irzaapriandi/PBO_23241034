class Kalkulator{
    // atribut
    double Perkalian;
    double Pembagian;
    double Penjumlahan;
    double Pengurangan;

    // constructor
    Kalkulator (double Input1, double Input2){
        Perkalian = Input1 * Input2;
        Pembagian = Input1 / Input2;
        Penjumlahan = Input1 + Input2;
        Pengurangan = Input1 - Input2;
        
        // cetak
        System.out.println("\nHasil Perkalian : " + Perkalian);
        System.out.println("Hasil Pembagian : " + Pembagian);
        System.out.println("Hasil Penjumlahan : " + Penjumlahan);
        System.out.println("Hasil Pengurangan : " + Pengurangan);
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi object class kalkulator
        Kalkulator Kalkulator1 = new Kalkulator(9.2, 6.2);

        Kalkulator kalkulator2 = new Kalkulator(8, 4);
    }
}