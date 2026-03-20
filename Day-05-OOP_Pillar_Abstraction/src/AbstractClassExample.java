
abstract class Shape{
    abstract double calculateArea();

    public void display(String shapeName){
        System.out.println("Area of "+ shapeName + " " +String.format(" %.2f", calculateArea() ));
    }
}

class Circle extends Shape{
    // circle has radious:
    private double radious;

    public Circle(double radious){
        this.radious = radious;
    }

    @Override
    double calculateArea(){
        return Math.PI * radious * radious;
    }
}

class Rectangle extends Shape{
    private double length  , width;

    public Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea(){
        return length * width;
    }
}


class Triangle extends Shape{
    private double base , height ;

    Triangle(double base , double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea(){
        return 0.5 * base * height;
    }

}


public class AbstractClassExample {

    public static void main(String[] args) {

        Shape circle = new Circle(2);
        circle.display("Circle");

        Shape rectangle = new Rectangle(10 , 20);
        rectangle.display("Rectangle");

        Shape triangle = new Triangle(10 ,20);
        triangle.display("triangle");
    }

}
