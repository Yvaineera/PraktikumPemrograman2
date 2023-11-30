package soal1;
import java.lang.Math;

public class sphere extends shape {
    private double radius;

    public sphere(Double radius){
        super("Sphere");
        this.radius = radius;
    }

    public Double area(){return 4*Math.PI*(radius*radius);}

    public String toString(){return super.toString() + " of radius " + radius;}
}