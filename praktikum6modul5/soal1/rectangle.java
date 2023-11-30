package soal1;

public class rectangle extends shape{
    private Double length, width;

    public rectangle(Double length,Double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public Double area(){return length*width;}

    public String toString(){return super.toString() + " of length " + length + " and width " + width;}
}