public class Pascal 
{
    public static void main(String[] args)
    {
      int outerValue, innerValue, spaces, num;
      for(outerValue=0; outerValue<5; outerValue++)
        {
          for(spaces=5; spaces>outerValue; spaces--)
            {
              System.out.print(" ");
            }
          num = 1;
          for(innerValue=0; innerValue<=outerValue; innerValue++)
            {
              System.out.print(num + " ");
              num = (num * (outerValue-innerValue)/(innerValue+1));
            }
          System.out.print("\n");
        }
    }
}
