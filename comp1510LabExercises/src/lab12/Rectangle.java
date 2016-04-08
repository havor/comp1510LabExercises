package lab12;

public class Rectangle extends Shape{
    double width;
    double height;
    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
        // TODO Auto-generated constructor stub
    }

    @Override
    double area() {
        // TODO Auto-generated method stub
        return width * height;
    }
    
    public String toString() {
        return super.toString() + " of width " + width 
                + " and heith " + height;
    }

}
