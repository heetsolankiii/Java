class SuperClass
{
    int age;

    SuperClass(int age)
    {
        this.age = age;
    }

    public void getAge()
    {
        System.out.println("This value of the variable named age in super class is: " + age);
    }
}
public class Subclass extends SuperClass
{
    Subclass(int age)
    {
        super(age);
    }
    public static void main(String[] args) {
        Subclass sc = new Subclass(24);
        sc.getAge();
    }
}