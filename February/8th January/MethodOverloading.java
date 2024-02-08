public class MethodOverloading {
    void area(int side)
    {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }
    void area(int length, int breadth)
    {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
    public static void main(String[] args) {
        int side = 6;
        int length = 9, breadth = 8;
        MethodOverloading obj = new MethodOverloading();
        obj.area(side);
        obj.area(length, breadth);
    }
}
