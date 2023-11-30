package soal1;

public class paint {
    private double coverage;

    public paint(double coverage){
        this.coverage = coverage;
    }

    public double amount(shape s){
        System.out.println("Computing amount for "+ s);
        return s.area()/coverage;
    }
}
