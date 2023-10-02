package Modul1;
import java.util.Scanner;
public class PRAK103_2210817220022_RayfhaZafiraAzzahra {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                int N = input.nextInt();
                int bilanganAwal = input.nextInt();

                int baris = 0;
                int bilangan = bilanganAwal;

                StringBuilder deret = new StringBuilder();

                do {
                    if (bilangan % 2 != 0) {
                        deret.append(bilangan);
                        if (baris < N - 1) {
                            deret.append(", ");
                        }
                        baris++;
                    }
                    bilangan++;
                } while (baris < N);

                System.out.println(deret);
            }
            input.close();
        }
    }
