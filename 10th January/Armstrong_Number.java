public class Armstrong_Number 
{
    public static void main(String[] args) 
    {
        int number = 1634, originalNumber = 0, remainder = 0, result = 0, n = 0;
        originalNumber = number;
        int originalNumber = number;
        while(originalNumber != 0) 
        {
            remainder = originalNumber % 10;
            n++;
            originalNumber /= 10;
    }
        while(originalNumber1 != 0)
        {
                remainder = originalNumber1 % 10;
                result += Math.pow(remainder, n);
                originalNumber1 /= 10;
        }
        if(result == number)
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
