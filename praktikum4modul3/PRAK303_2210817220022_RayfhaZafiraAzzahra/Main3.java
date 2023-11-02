package PRAK303_2210817220022_RayfhaZafiraAzzahra;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = scanner.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                daftarMahasiswa.add(mahasiswa);

                System.out.println("Mahasiswa " + nama + " ditambahkan.");
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimHapus = scanner.nextLine();

                for (int i = 0; i < daftarMahasiswa.size(); i++) {
                    if (daftarMahasiswa.get(i).getNIM().equals(nimHapus)) {
                        daftarMahasiswa.remove(i);
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                        break;
                    }
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                String nimCari = scanner.nextLine();

                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNIM().equals(nimCari)) {
                        System.out.println("Mahasiswa ditemukan:");
                        System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
                        break;
                    }
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
                }
            } else if (pilihan == 0) {
                System.out.println("Terima kasih!");
                daftarMahasiswa.clear();
                break;
            }
        }
    }
}
