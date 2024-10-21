class Motor {
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    public Motor(String merek, int tahun, String noPolisi, String warna){
        this.merk = merek;
        this.tahun = tahun;
        this.noPolisi = noPolisi;
        this.warna = warna;
    }
    void showInfoMotor(){
        System.out.println("Merek : "+ this.merk);
        System.out.println("Tahun : "+ this.tahun);
        System.out.println("NO Polisi : "+ this.noPolisi);
        System.out.println("Warna : "+ this.warna);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Motor mtr1 = new Motor("Honda Gl Pro", 1997, "G 5879", "Hitam");
        mtr1.showInfoMotor();
    }
}
