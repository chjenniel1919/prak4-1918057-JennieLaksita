package com.example.pertemuan4_recycleview;

public class Mahasiswa {
    private String nama, nim, angkatan;
    private int logo;

    public Mahasiswa(String nama, String nim, String angkatan, int logo) {
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
}
