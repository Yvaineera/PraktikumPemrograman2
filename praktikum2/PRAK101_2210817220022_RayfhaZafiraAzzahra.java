package Modul1;
import java.util.Scanner;
public class PRAK101_2210817220022_RayfhaZafiraAzzahra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir : ");
        String tempat = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir : ");
        int tgl = input.nextInt();

        System.out.print("Masukkan Bulan Lahir : ");
        int bulan = input.nextInt();

        System.out.print("Masukkan Tahun Lahir : ");
        int tahun = input.nextInt();

        System.out.print("Masukkan Tinggi Badan : ");
        int TB = input.nextInt();

        System.out.print("Masukkan Berat Badan : ");
        Double BB = input.nextDouble();

        String Bulan = getbulan (bulan);
        System.out.println("Nama Lengkap "+nama+", Lahir di "+tempat+" pada tanggal "+tgl+" "+Bulan+" "+tahun);
        System.out.println("Tinggi Badan "+TB+" cm dan Berat Badan "+BB+" kilogram");


    }

    private static String getbulan(int bulan) {
        String[] namabulan = {"januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","Nevember","Desember"};
        if(bulan >= 1 && bulan <= 12){
            return namabulan[bulan-1];
        }
        else {
            return "Bulan tidak ada";
        }
    }
}
