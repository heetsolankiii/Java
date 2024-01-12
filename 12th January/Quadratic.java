public class Quadratic
{
    public static void main(String[] args) 
    {
        int a = 1, b = 5, c = 2;
        double roots1,roots2;
        roots1 = (-b + Math.sqrt((b*b) - 4*a*c))/2*a;
        roots2 = (-b - Math.sqrt((b*b) - 4*a*c))/2*a;
        System.out.println("Roots are: " + roots1 + "&" + roots2);
    }
}