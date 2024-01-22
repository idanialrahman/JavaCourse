import java.util.PrimitiveIterator;

abstract class Shape{
    public abstract double calculateArea(); // Abstract Method
    public void displayArea(){
        System.out.println("Area:"+ calculateArea());
    }

}

class Circle extends Shape{

    private double size;

    public void Circle(double size) {
        this.size = size;
    }

    @Override
    public double calculateArea() {
        return Math.PI* size* size;
    }
}
class Square extends Shape{
    private double raduis;

    public void Square(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double calculateArea() {
        return Math.PI*raduis*raduis;
    }
}



public class AbstractClassAndFunction {
    public static void main(String[] args) {

        Circle myc= new Circle();
        myc.Circle(90.9);
        myc.displayArea();

        Square mys = new Square();
        mys.Square(90);
        mys.displayArea();




    }
}