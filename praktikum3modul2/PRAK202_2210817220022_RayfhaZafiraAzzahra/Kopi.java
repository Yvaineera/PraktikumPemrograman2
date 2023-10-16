package PRAK202_2210817220022_RayfhaZafiraAzzahra;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;

    // Method untuk menampilkan informasi kopi
    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    // Method untuk mengatur pembeli
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    // Method untuk menghitung pajak
    public double getPajak() {
        double pajak = harga * 0.11;
        return pajak;
    }

    // Method untuk mendapatkan pembeli
    public String getPembeli() {
        return pembeli;
    }
}
