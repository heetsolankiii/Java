import java.util.*;
public class FactorialMethod {
    int Fact(int number) {
        int f = 1;
        for(int i = 1; i <= number; i++)
        {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        FactorialMethod myObj = new FactorialMethod();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = userInput.nextInt();
        int factorial = myObj.Fact(number);
        System.out.println(number + "! = " + factorial);
    }
}