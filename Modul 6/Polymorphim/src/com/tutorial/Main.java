package com.tutorial;

public class Main {
    public static void main(String[] args) {

        Manusia mns;

        Mahasiswa mhs = new Mahasiswa();
        mns = mhs;
        mns.setNama("Naruto");
        System.out.println(mns.getNama());

        Karyawan kar = new Karyawan();
        mns = kar;
        mns.setNama("Saitama");
        System.out.println(mns.getNama());
    }
}