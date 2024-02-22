// Question: Create an interface shape with method getArea. Create three classes rectangle, circle, and triangle that implement the interface shape. Implement getArea method for each of the classes.

interface Shape {
    void getArea();
}

class Rectangle {
    public void getArea() {
        int length = 10, breadth = 20;
        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }
}

class Circle {
    public void getArea() {
        int radius = 5;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Cricle is: " + area);
    }
}

class Triangle {
    public void getArea() {
        int breadth = 10, height = 15;
        double area = 0.5 * breadth * height;
        System.err.println("Area of Triangle is: " + area);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();
        r.getArea();
        c.getArea();
        t.getArea();
    }
}