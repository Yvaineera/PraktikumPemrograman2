package Modul1;
import java.util.Scanner;
public class PRAK104_2210817220022_RayfhaZafiraAzzahra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Tangan Abu: ");
            String tanganAbu1 = input.next();
            String tanganAbu2 = input.next();
            String tanganAbu3 = input.next();

            System.out.print("Tangan Bagas: ");
            String tanganBagas1 = input.next();
            String tanganBagas2 = input.next();
            String tanganBagas3 = input.next();

            int skorAbu = 0;
            int skorBagas = 0;


            if (tanganAbu1.equals("B") && tanganBagas1.equals("G")
                    || tanganAbu1.equals("G") && tanganBagas1.equals("K")
                    || tanganAbu1.equals("K") && tanganBagas1.equals("B")) {
                skorAbu++;
            } else if (tanganBagas1.equals("B") && tanganAbu1.equals("G")
                    || tanganBagas1.equals("G") && tanganAbu1.equals("K")
                    || tanganBagas1.equals("K") && tanganAbu1.equals("B")) {
                skorBagas++;
            }
            if (tanganAbu2.equals("B") && tanganBagas2.equals("G")
                    || tanganAbu2.equals("G") && tanganBagas2.equals("K")
                    || tanganAbu2.equals("K") && tanganBagas2.equals("B")) {
                skorAbu++;
            } else if (tanganBagas2.equals("B") && tanganAbu2.equals("G")
                    || tanganBagas2.equals("G") && tanganAbu2.equals("K")
                    || tanganBagas2.equals("K") && tanganAbu2.equals("B")) {
                skorBagas++;
            }
            if (tanganAbu3.equals("B") && tanganBagas3.equals("G")
                    || tanganAbu3.equals("G") && tanganBagas3.equals("K")
                    || tanganAbu3.equals("K") && tanganBagas3.equals("B")) {
                skorAbu++;
            } else if (tanganBagas3.equals("B") && tanganAbu3.equals("G")
                    || tanganBagas3.equals("G") && tanganAbu3.equals("K")
                    || tanganBagas3.equals("K") && tanganAbu3.equals("B")) {
                skorBagas++;
            }


            if (skorAbu > skorBagas) {
                System.out.println("Abu\n");
            } else if (skorBagas > skorAbu) {
                System.out.println("Bagas\n");
            } else {
                System.out.println("Seri\n");
            }
        }
        input.close();
    }
}

