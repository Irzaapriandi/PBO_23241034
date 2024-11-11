class Data{
    // data member atau variabel instan
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // konstruktor dengan modifier public
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 1000;
        this.doublePrivate = 3.14;
    }

    // method modifier default
    void cetak(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
    }

    // method setter
    public void setIntPrivate(int value){
        this.intPrivate = value;
    }

    // method getter
    public double getDoublePrivate(){
        return this.doublePrivate;
    }
}




public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Data objek = new Data();

        // baca dan tulis dengan public
        objek.intPublic = 50; // tulis
        System.out.println("Public : " + objek.intPublic); // baca

        // tulis saja (setter)
        objek.setIntPrivate(10);
        objek.cetak();

        // baca saja (getter)
        double angka = objek.getDoublePrivate();
        System.out.println("getter : " + angka);
    }
}
