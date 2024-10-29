public interface Shape {
    public void getAtributes();
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void getAtributes() {
        System.out.println("Circle: radius is " + radius + ".");
        double area = Math.PI * radius * radius;
        System.out.println("Circle: area is " + area + ".");
    }
}
class Rectangle implements Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void getAtributes() {
        System.out.println("Rectangle: width is " + width + ".");
        System.out.println("Rectangle: height is " + height + ".");
        System.out.println("Rectangle: area is " + width * height + ".");
    }
}
class Square implements Shape {
    private double width1;
    public Square(double width) {
        this.width1 = width;
    }
    @Override
    public void getAtributes() {
        System.out.println("Square: width is " + width1 + ".");
        System.out.println("Square: area is " + width1 * width1 + ".");
    }
}