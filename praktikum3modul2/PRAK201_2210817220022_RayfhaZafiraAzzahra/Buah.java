package PRAK201_2210817220022_RayfhaZafiraAzzahra;

public class Buah {
    String nama;
    double Berat;
    double Harga;
    double jumlahBeli;
    double hargaSebelumDiskon;
    double diskon;
    double hargaSetelahDiskon;
    public Buah(String nama, double Berat, double Harga,double jumlahBeli, double hargaSebelumDiskon){
        this.nama=nama;
        this.Berat=Berat;
        this.Harga=Harga;
        this.hargaSebelumDiskon=hargaSebelumDiskon;
        this.jumlahBeli=jumlahBeli;
    }
    public void Diskon(){
        diskon= (Math.floor(jumlahBeli/4) *0.02* Harga*4);
        hargaSetelahDiskon=hargaSebelumDiskon-diskon;
        System.out.printf("Total diskon :Rp%.2f\n", diskon);
        System.out.printf("Harga setelah diskon :Rp%.2f\n\n", hargaSetelahDiskon);
    }
    void InfoBuah(){
        System.out.println("Nama buah : "+nama);
        System.out.println("Berat : "+Berat);
        System.out.println("Harga : "+Harga);
        System.out.println("Jumlah Beli  : "+jumlahBeli+"Kg");
        System.out.printf("Harga sebelum diskon  :Rp%.2f\n",hargaSebelumDiskon);
        Diskon();
    }
}

