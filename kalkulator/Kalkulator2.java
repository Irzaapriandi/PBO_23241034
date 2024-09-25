/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator2;
import java.util.Scanner;
/**
 *
 * @author Laptop
 */
public class Kalkulator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        char lanjutkan = 'y';
        
        while (lanjutkan == 'y' ) {
            System.out.println("|==================|");
            System.out.println("|       Menu       |");
            System.out.println("|==================|");
            System.out.println("| 1. | Perkalian   |");
            System.out.println("|------------------|");
            System.out.println("| 2. | Penjumlahan |");
            System.out.println("|------------------|");
            System.out.println("| 3. | Pengurangan |");
            System.out.println("|------------------|");
            System.out.println("| 4. | Pembagian   |");
            System.out.println("|==================|");
            
            System.out.print("Masukkan Pilihan Anda : ");
            int nomor = scanner.nextInt();
            
            System.out.print("Masukkan bil 1 : ");
            double bil1 = scanner.nextDouble();
                
            System.out.print("Masukkan Bil 2 : ");
            double bil2 = scanner.nextDouble();
            
            double Hasil = 0;
            
            if (nomor == 1) {
                Hasil = bil1*bil2;
                System.out.println("Hasil : " + Hasil);
            } else if (nomor == 2) {
                Hasil = bil1+bil2;
                System.out.println("Hasil : " + Hasil);
            } else if (nomor == 3) {
                Hasil = bil1-bil2;
                System.out.println("Hasil : " + Hasil);
            } else if (nomor == 4) {
                if ( bil2 != 0 ) {
                    Hasil = bil1/bil2;
                    System.out.println("Hasil : " + Hasil);
                } else {
                    System.out.println("Kesalahan!");
                }         
            } else {
                System.out.println("Pilihan Tidak Valid");
            }
            System.out.print("Mau lagi? (y/n) : ");
            lanjutkan = scanner.next().charAt(0);
        }
        
        System.out.println("Terimakasih!");
    }
    
}
