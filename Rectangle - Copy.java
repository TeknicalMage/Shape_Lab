public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2length + 2width;
    }
}