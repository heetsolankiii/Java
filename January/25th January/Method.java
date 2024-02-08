import java.util.*;
public class Method {
    static void Add(int a, int b) {
        int add = a + b;
        System.out.println(add);
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = userInput.nextInt();
        System.out.print("Enter value for b: ");
        int b = userInput.nextInt();
        Add(a, b);
        userInput.close();
    }
}
