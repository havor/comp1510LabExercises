package lab12;

public class Cylinder extends Shape{
    private double radius;
    private double height;
    Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
        // TODO Auto-generated constructor stub
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        double sideArea = Math.PI *  2 * radius * height;
        double bottomArea = Math.PI * Math.pow(radius, 2);
        return sideArea + 2 * bottomArea;
    }
    
    public String toString(){
        return super.toString() + " of radius " + radius
               + " and height " + height;
    }

}
