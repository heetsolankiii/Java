public class Armstrong_Number {
    public static void main(String[] args) {
        int number = 371, originalNumber, remainder=0, sum=0, cube=0;   //Initializing all the variables
        originalNumber = number;    //Copying the number to another variable
        while (originalNumber != 0)     //Checking for the condition
        {
            remainder = originalNumber % 10;    //Finding remainder of the last digit
            cube = remainder*remainder*remainder;   //Finding cube of the remainder
            sum = sum + cube;   //Adding it to sum
            originalNumber = originalNumber / 10;   //Dividing the number by 10
        }
        if(sum == number)   //If number is an Armstrong Number
        {
            System.out.println(number + " is an Armstrong Number.");    //Printing the same
        }
        else    //If number is not an Armstrong Number
        {
            System.out.println(number + " is not an Armstrong Number.");    //Printing the same
        }
    }
}
