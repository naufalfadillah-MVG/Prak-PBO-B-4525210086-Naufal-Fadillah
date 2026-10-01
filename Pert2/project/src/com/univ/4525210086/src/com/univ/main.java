package com.univ;

public class main {
    public static void main (String[] args) {
        mahasiswa Naufal = new mahasiswa(
            "4525210086",
            "Prodi Informatika",
            "Naufal",
            "Fadillah",
            "29 Maret 2008",
            "Cibitung",
            18
            );

        mahasiswa Rakhyan = new mahasiswa(
            "4525210079",
            "Prodi Informatika",
            "Rakhyan",
            "Harun",
            "19 Maret 2007",
            "Tambun",
            19
            );

        Naufal.displayInfo();
        Rakhyan.displayInfo();

        Naufal.belajar();
        Rakhyan.ujian();
    }
}