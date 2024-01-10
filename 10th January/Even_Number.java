public class Even_Number {
    public static void main(String[] args) 
    {
        int i = 1;  //Initializing the variable
        while (i <= 20) //Checking for the condition
        {
            if (i % 2 == 0) //Checking if the number is even or not
            {
                System.out.print(i + "  "); //Printing the value of i
            }
            i = i + 1;  //Incrementing the value of i by 1
        }
    }
}