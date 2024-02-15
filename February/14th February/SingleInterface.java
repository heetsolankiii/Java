interface MainClass
  {
    void FirstMethod();
    void SecondMethod();
  }
class SingleInterface implements MainClass {
  public void FirstMethod() {
    System.out.println("First Method");
  }
  public void SecondMethod() {
    System.out.println("Second Method");
  }
  public static void main(String[] args) {
    SingleInterface obj = new SingleInterface();
    obj.FirstMethod();
    obj.SecondMethod();
  }
}