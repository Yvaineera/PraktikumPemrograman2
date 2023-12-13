package com.example.praktikum6;

public class Mahasiswa {
    int id;
    String nama;
    String nim;

    public Mahasiswa(int id, String nama, String nim) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
    }

    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
}
