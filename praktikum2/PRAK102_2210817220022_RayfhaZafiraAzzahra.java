package Modul1;
import java.util.Scanner;
public class PRAK102_2210817220022_RayfhaZafiraAzzahra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int angka = input.nextInt();
            int baris = 0;
            int angka2;

            StringBuilder deret = new StringBuilder();

            do {
                if (angka % 5 == 0) {
                    angka2 = angka / 5 - 1;
                    deret.append(angka2);
                } else {
                    deret.append(angka);
                }
                if (baris < 9) {
                    deret.append(",");
                }
                baris++;
                angka++;
            } while (baris < 10);

            System.out.println(deret);
        }
        input.close ();
    }
}