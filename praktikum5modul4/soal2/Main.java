package soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis hewan peliharaan:");
        System.out.println("1. Kucing");
        System.out.println("2. Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            scanner.nextLine();
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();
            System.out.print("Ras: ");
            String ras = scanner.nextLine();
            System.out.print("Warna bulu: ");
            String warnaBulu = scanner.nextLine();
            Kucing kucing = new Kucing(nama, ras, warnaBulu);
            kucing.displayDetailKucing();}
        else if (pilihan == 2) {
            scanner.nextLine();
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();
            System.out.print("Ras: ");
            String ras = scanner.nextLine();
            System.out.print("Warna bulu: ");
            String warnaBulu = scanner.nextLine();
            System.out.print("Kemampuan: ");
            String[] kemampuan = new String[]{scanner.nextLine()};
            Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
            anjing.displayDetailAnjing();}
    }
}