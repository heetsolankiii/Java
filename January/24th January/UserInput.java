import java.util.*;
class UserInput
{
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = userInput.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = userInput.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=" + sum);
    }
}