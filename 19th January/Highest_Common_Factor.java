public class Highest_Common_Factor {
    public static void main(String[] args) {
        int number1 = 18, number2 = 27, highestCommonFactor = 0;        // Intializing the variables
        for(int i = 1 ; i <= number1 || i <= number2 ; i++)     // Starting the loop
        {
            if(number1 % i == 0 && number2 % i == 0)        // If i is divisible with number 1 & 2
            {
                highestCommonFactor = i;        // Value of i is give to highestCommonFactor
            }
        }
        System.out.println(highestCommonFactor);        // Printing highestCommonFactor
    }
}
