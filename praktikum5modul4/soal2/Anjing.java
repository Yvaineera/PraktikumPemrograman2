package soal2;
import java.util.Arrays;

public  class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String nama, String ras, String warnaBulu, String[] kemampuan){
        super(nama, ras);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }

    public void displayDetailAnjing(){
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + Arrays.toString(kemampuan).replace("[","").replace("]","").replace(",",""));
    }
}
