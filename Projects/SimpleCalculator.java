import java.util.*;
public class SimpleCalculator {
    //Addition
    static void Addition(int firstNumber, int secondNumber) {
        int calculate = (firstNumber + secondNumber);
        System.out.println(firstNumber + "+" + secondNumber + "=" + calculate);
    }

    //Subtraction
    static void Subtraction(int firstNumber, int secondNumber) {
        int calculate = (firstNumber - secondNumber);
        System.out.println(firstNumber + "-" + secondNumber + "=" + calculate);    
    }

    //Multiplication
    static void Multiplication(int firstNumber, int secondNumber) {
        int calculate = (firstNumber * secondNumber);
        System.out.println(firstNumber + "*" + secondNumber + "=" + calculate);    }

    //Division
    static void Division(int firstNumber, int secondNumber) {
        int calculate = (firstNumber / secondNumber);
        System.out.println(firstNumber + "/" + secondNumber + "=" + calculate);
    }

    //Modulus
    static void Modulus(int firstNumber, int secondNumber) {
        int calculate = (firstNumber % secondNumber);
        System.out.println(firstNumber + "%" + secondNumber + "=" + calculate);    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Scanner operationPerformer = new Scanner(System.in);
        int start = 1;
        while(start==1)
        {
            System.out.print("First Number: ");     //Accepting Frist Number
            int firstNumber = userInput.nextInt();
            System.out.print("Second Number: ");     //Accepting Second Number
            int secondNumber = userInput.nextInt();
            System.out.println("Which operation would you like to perform?");
            System.out.println("\'+\' for Addition");
            System.out.println("\'-\' for Subtraction");
            System.out.println("\'*\' for Multiplication");
            System.out.println("\'/\' for Division");
            System.out.println("\'%\' for Modulus");
            System.out.print("Enter operation: ");     //Accepting Operation
            String operation = operationPerformer.nextLine();
            switch(operation)
            {
                case "+":       //Addition
                    Addition(firstNumber, secondNumber);
                    break;
                case "-":       //Subtraction
                    Subtraction(firstNumber, secondNumber);
                    break;
                case "*":       //Multiplication
                    Multiplication(firstNumber, secondNumber);
                    break;
                case "/":       //Division
                    Division(firstNumber, secondNumber);
                    break;
                case "%":       //Modulus
                    Modulus(firstNumber, secondNumber);
                    break;
                default:       //Wrong Input
                    System.out.println("Wrong operation");
                    break;
            }
            System.out.print("To CONTINUE enter \'1\' or STOP enter \'0\': ");      //To continue or stop
            start = userInput.nextInt();
        }
        userInput.close();
        operationPerformer.close();
    }
}
