class Calculation {
    int result;
    void addition(int x, int y)
    {
        result = x + y;
        System.out.println(x + " + " + y + " = " + result);
    }
    void subtraction(int x, int y)
    {
        result = x - y;
        System.out.println(x + " - " + y + " = " + result);
    }
}
public class SingleInheritance extends Calculation {
    int result;
    public void multipllication(int x, int y)
    {
        result = x * y;
        System.out.println(x + " * " + y + " = " + result);
    }
    public static void main(String[] args) {
        int x = 9, y = 7;
        SingleInheritance obj = new SingleInheritance();
        obj.addition(x, y);
        obj.subtraction(x, y);
        obj.multipllication(x, y);

    }
}
