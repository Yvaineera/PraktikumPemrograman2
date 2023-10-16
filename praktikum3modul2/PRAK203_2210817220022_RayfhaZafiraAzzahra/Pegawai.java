package PRAK203_2210817220022_RayfhaZafiraAzzahra;
public class Pegawai {
    public String nama;
    public String asal;  // Perbaikan: Mengganti tipe data char menjadi String
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {  // Perbaikan: Mengganti tipe data char menjadi String
        return asal;
    }

    public void setJabatan(String j) {  // Perbaikan: Menambahkan parameter j dan mengaturnya ke jabatan
        this.jabatan = j;
    }
}

