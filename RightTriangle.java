public class RightTriangle extends Shape{
    private double length;
    private double height;

    public RightTriangle(double length,double height){
        this.length = length;
        this.height = height;
    }

    public double getArea(){
        return length * height * .5;
    }

    public double getPerimeter(){
        return length + height + Math.sqrt(lengthlength+heightheight);
    }
}
