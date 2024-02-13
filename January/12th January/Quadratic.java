import java.util.*;

public class Quadratic
{
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = userInput.nextInt();
        System.out.print("Enter value for b: ");
        int b = userInput.nextInt();
        System.out.print("Enter value for c: ");
        int c = userInput.nextInt();
        double roots1,roots2;
        roots1 = (-b + Math.sqrt((b*b) - 4*a*c))/2*a;
        roots2 = (-b - Math.sqrt((b*b) - 4*a*c))/2*a;
        System.out.println("Roots are: " + roots1 + "&" + roots2);
        userInput.close();
    }
}