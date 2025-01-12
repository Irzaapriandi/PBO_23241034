package com.tutorial;

// Super class
public class Member {
    String nama;
    double totalBelanja;
    private double potongan1 = 0.10;
    private double potongan2 = 0.05;
    private double potongan3 = 0.03;

    Member(String nama, double totalBelanja) {
        this.nama = nama;
        this.totalBelanja = totalBelanja;

    }

    public double menghitungPotongan() {
        if (totalBelanja > 500_000) {
            return totalBelanja * potongan1;
        } else if (totalBelanja > 100_000 && totalBelanja < 500_000) {
            return totalBelanja * potongan2;
        } else {
            return totalBelanja * potongan3;
        }
    }

    public void showDetailBelanja() {
        double totalSetelah = totalBelanja - menghitungPotongan();
        double dalamPersen = (totalBelanja > 500_000) ? potongan1 * 100
                : (totalBelanja > 100_000) ? potongan2 * 100 : potongan3 * 100;

        System.out.println("\nNama : " + nama);
        System.out.println("Status : Member");
        System.out.println("Total Belanja Sebelum :" + totalBelanja);
        System.out.println("Diskon : " + dalamPersen + "%");
        System.out.println("Diskon dalam rupiah : " + menghitungPotongan());
        System.out.println("Total Belanja Setelah : " + totalSetelah);
    }

}
