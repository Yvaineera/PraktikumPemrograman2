package soal1;

public class cylinder extends shape{
    private Double radius
    private Double height;

    public cylinder(Double radius, Double height){
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public Double area(){return Math.PI*(radius*radius)*height;}

    public String toString(){return super.toString() + " of radius " + radius + " and height " + height;}
}
