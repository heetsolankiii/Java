package Java;

public class Smallest {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=1;
        if (a<b) {
            if (a<c) {
                System.out.println("A is the smallest.");
            } else {
                System.out.println("C is the smallest.");
            }
        } else {
            if (b<c) {
                System.out.println("B is the smallest.");
            } else {
                System.out.println("C is the smallest");
            }
        }
    }
}