import java.util.Scanner;

class Occurence {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Scanner occurence = new Scanner(System.in);
        int a[] = new int[10];
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter value for a[" + i + "]: ");
            a[i] = userInput.nextInt();
        }
        System.out.print("Enter a target: ");
        int target = occurence.nextInt();
        for(int i = 0; i < 10; i++)
        {
            if(target == a[i])
            {
                count++;
            }
        }
        System.out.println(target + " was found " + count + " times.");
    }
}