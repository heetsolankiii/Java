public class Rectangle {
    int length = 5;
    int breadth = 9;
    int Area() {
        int area = length * breadth;
        return area;
    }
    void Print(int area) {
        System.out.println("The length is: " + length);
        System.out.println("The breadth is: " + breadth);
        System.out.println("The area is: " + area);
    }
    public static void main(String[] args) {
        Rectangle myObj = new Rectangle();
        int area = myObj.Area();
        myObj.Print(area);
    }
}
