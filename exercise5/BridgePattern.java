package exercise5;

public class BridgePattern {
    public static void main(String[] args) {
        Drawing DrawingFirst = new DrawingFirst();
        Drawing DrawingSecond = new DrawingSecond();

        Shape circle1 = new Circle(1, 2, 3, DrawingFirst);
        Shape circle2 = new Circle(5, 7, 11, DrawingSecond);

        Shape rectangle1 = new Rectangle(3, 4, 5, 6, DrawingFirst);
        Shape rectangle2 = new Rectangle(8, 9, 10, 11, DrawingSecond);

        circle1.draw();
        circle2.draw();
        rectangle1.draw();
        rectangle2.draw();
    }
}

// Abstraction
abstract class Shape {
    protected Drawing drawing;

    protected Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    public abstract void draw();
}

// Implementation
interface Drawing {
    void drawCircle(double x, double y, double radius);
    void drawRectangle(double x, double y, double width, double height);
}

class DrawingFirst implements Drawing {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("DrawingFirst circle at (%f,%f) radius %f\n", x, y, radius);
    }

    public void drawRectangle(double x, double y, double width, double height) {
        System.out.printf("DrawingFirst rectangle at (%f,%f) width %f, height %f\n", x, y, width, height);
    }
}

class DrawingSecond implements Drawing {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("DrawingSecond circle at (%f,%f) radius %f\n", x, y, radius);
    }

    public void drawRectangle(double x, double y, double width, double height) {
        System.out.printf("DrawingSecond rectangle at (%f,%f) width %f, height %f\n", x, y, width, height);
    }
}

class Circle extends Shape {
    private double x, y, radius;

    public Circle(double x, double y, double radius, Drawing drawing) {
        super(drawing);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawing.drawCircle(x, y, radius);
    }
}

class Rectangle extends Shape {
    private double x, y, width, height;

    public Rectangle(double x, double y, double width, double height, Drawing drawing) {
        super(drawing);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        drawing.drawRectangle(x, y, width, height);
    }
}