package com.univ;

public class mahasiswa {
    
    private String npm;
    private String prodi;
    private String namaDepan;
    private String namaBelakang;
    private String tanggalLahir;
    private String alamat;
    private int umur;

    public mahasiswa(String npm, String prodi, String namaDepan, String namaBelakang, String tanggalLahir, String alamat, int umur) {
        this.npm = npm;
        this.prodi = prodi;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.umur = umur;
}

public String getNpm() {
    return npm;
}

public void setNpm(String npm) {
    this.npm = npm;
}

public String getProdi() {
    return prodi;
}

public void setProdi(String prodi) {
    this.prodi = prodi;
}

public String getNamaDepan() {
    return namaDepan;
}

public void setNamaDepan(String namaDepan) {
    this.namaDepan = namaDepan;
}

public String getNamaBelakang() {
    return namaBelakang;
}

public void setNamaBelakang(String namaBelakang) {
    this.namaBelakang = namaBelakang;
}

public String getTanggalLahir() {
    return tanggalLahir;
}

public void setTanggalLahir(String tanggalLahir) {
    this.tanggalLahir = tanggalLahir;
}

public String getAlamat() {
    return alamat;
}

public void setAlamat(String alamat) {
    this.alamat = alamat;
}

public int getUmur() {
    return umur;
}

public void setUmur(int umur) {
    this.umur = umur;
}

public void belajar() {
    System.out.println(namaDepan + " sedang belajar");
}

public void ujian() {
    System.out.println(namaDepan + " sedang ujian");
}


public void displayInfo() {
    System.out.println("=== Data Mahasiswa ===");
    System.out.println("NPM             : " + npm);
    System.out.println("Prodi           : " + prodi);
    System.out.println("Nama Depan      : " + namaDepan);
    System.out.println("Nama Belakang   : " + namaBelakang);
    System.out.println("Tanggal Lahir   : " + tanggalLahir);
    System.out.println("Alamat          : " + alamat);
    System.out.println("Umur            : " + umur);
    System.out.println();
}
}