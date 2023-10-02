package Modul1;
import java.util.Scanner;
public class PRAK105_2210817220022_RayfhaZafiraAzzahra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double phi = 3.14;
        for(int i = 0; i<3; i++){
            System.out.print("Masukkan jari-jari : ");
            Double r = scanner.nextDouble();
            System.out.print("Masukkan tinggi : ");
            Double t = scanner.nextDouble();

            double v = phi * r * r * t;

            System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n\n", r, t, v);
        }
    }
}
