public class Prime 
{
    public static void main(String[] args) 
    {
        int x = 20, i, count=0;
        for(i = 1; i <= x; i++)
        {
            if(x%i==0)
            {
                count++;
            }
            else
            {
                continue;
            }
            if(count>2)
            {
                break;
            }
            else
            {
                continue;
            }
        }
        if(count==2)
        {
            System.out.println(x + " is a prime number.");
        }
        else
        {
            System.out.println(x + " is not a prime number.");
        }
    }
}