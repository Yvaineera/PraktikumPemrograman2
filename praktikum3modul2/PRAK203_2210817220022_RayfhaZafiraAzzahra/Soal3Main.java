package PRAK203_2210817220022_RayfhaZafiraAzzahra;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai(); 
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //pada baris ini ditambahkan inisialisasi p1.umur sehingga print pada baris 15 tidak menunjukkan output 0
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " Tahun");  
    }
}
