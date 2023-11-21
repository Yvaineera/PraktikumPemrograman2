package soal1;
import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan() {
        this.nama = nama;
        this.ras = ras;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan : ");
        String nama = scanner.next();
        System.out.print("Ras : ");
        String ras = scanner.next();
        System.out.println("Detail Hewan Peliharaan : ");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
