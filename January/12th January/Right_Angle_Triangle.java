public class Right_Angle_Triangle 
{
    public static void main(String[] args) 
    {
        int a = 12, b = 5, c = 13;
        if (a > b) 
        {
            if (a > c) 
            {
                if ((a*a)==(b*b)+(c*c)) 
                {
                    System.out.println("It is a right angle triangle. And A is the Hypotenuse");
                } 
                else 
                {
                    System.out.println("It is not a right angle triangle.");
                }
            } 
            else 
            {
                if ((c*c)==(b*b)+(a*a)) 
                {
                    System.out.println("It is a right angle triangle. And C is the Hypotenuse");
                } 
                else 
                {
                    System.out.println("It is not a right angle triangle.");
                }
            }
        } 
        else 
        {
            if (b > c) 
            {
                if ((b*b)==(a*a)+(c*c)) 
                {
                    System.out.println("It is a right angle triangle. And B is the Hypotenuse");
                } 
                else 
                {
                    System.out.println("It is not a right angle triangle.");
                }
            }  
            else 
            {
                if ((c*c)==(b*b)+(a*a)) 
                {
                    System.out.println("It is a right angle triangle. And C is the Hypotenuse");
                } 
                else 
                {
                    System.out.println("It is not a right angle triangle.");
                }
            }
        }
    }
}