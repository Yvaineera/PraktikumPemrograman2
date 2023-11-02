package PRAK301_2210817220022_RayfhaZafiraAzzahra;
import java.util.Scanner;
import java.util.LinkedList;
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int jumlah = scanner.nextInt();
        LinkedList<Dadu> daduList = new LinkedList<Dadu>();

        for (int i = 0; i < jumlah; i++){
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getNilai());
        }

        int total = 0;
        for(Dadu dadu : daduList){
            total += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
