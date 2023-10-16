package PRAK202_2210817220022_RayfhaZafiraAzzahra;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public double getPajak() {
        double pajak = harga * 0.11;
        return pajak;
    }

    public String getPembeli() {
        return pembeli;
    }
}
