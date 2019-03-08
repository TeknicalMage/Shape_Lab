public abstract class Shape{
    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
        return (getClass().getName() + ",\t Area: " + getArea() + ",\t Perimeter: " + getPerimeter());
    }
}
