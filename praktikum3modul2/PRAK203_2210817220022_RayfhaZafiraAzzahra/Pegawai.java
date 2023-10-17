package PRAK203_2210817220022_RayfhaZafiraAzzahra;
//pada baris ini terjadi error karena nama class yang tidak sesuai
// public class Employee {
public class Pegawai {
    public String nama;
    //pada baris ini terdapat error karena kesalahan tipe data
    //public char asal;
    public String asal;  
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() { 
        return asal;
    }
    //pada baris ini terjadi error karena tidak ada parameter yang diterima method
    //public void setJabatan(){
    public void setJabatan(String jabatan) {  
        this.jabatan = jabatan;
    }
}

