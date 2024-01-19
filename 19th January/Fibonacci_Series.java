public class Fibonacci_Series {
    public static void main(String[] args) {
        int i = 0, j = 1, sum = 0;
        System.out.print(i + "  ");
        System.out.print(j + "  ");
        for(int k = 1; k <= 6; k++)
        {
            sum = i + j;
            System.out.print(sum + "  ");
            i = j;
            j = sum;
        }
    }
}
