package com.tutorial;

// sub class
public class nonMember extends Member {
    
    private double potongan = 0.03;
    
    nonMember(String nama, double totalBelanja){
        super(nama,totalBelanja);
    }
    
    public double menghitungPotongan(){
        if (totalBelanja > 100_000){
            return totalBelanja*potongan;
        } 
        return 0;
    }
    
    public void showDetailBelanja() {
        double totalSetelah = totalBelanja-menghitungPotongan();
        
        System.out.println("\nNama : " + nama);
        System.out.println("Status : Non Member");
        System.out.println("Total Belanja Sebelum :" + totalBelanja);
        System.out.println("Diskon : " + (totalBelanja > 100_000 ? potongan*100:0) + "%");
        System.out.println("Diskon dalam rupiah : " + menghitungPotongan());
        System.out.println("Total Belanja Setelah : " + totalSetelah);
    }
}
