package lab12;

public abstract class Shape {
    private String shapeName;
    Shape(String shapeName){
        this.shapeName = shapeName;
    }
    abstract double area();
    public String toString(){
        return shapeName;
    }
}
