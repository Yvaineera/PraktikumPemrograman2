package Praktikum1;
import java.util.Scanner;

public class PRAK005_2210817220022_RayfhaZafiraAzzahra {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     System.out.print("Masukan Makanan Favorit : ");
     String makananfav = scanner.nextLine();

     System.out.print("Masukan Hobi : ");
     String hobi = scanner.nextLine();

     System.out.println("Aku Suka Makan " + makananfav + ", dan Hobiku " + hobi);
    }
}
