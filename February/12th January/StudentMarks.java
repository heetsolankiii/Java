import java.util.*;

class Student {
    int rollno;
    String name;
    void getDetails()
    {
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter the name: ");
      name = userInput.nextLine();
      System.out.print("Enter the rollno: ");
      rollno = userInput.nextInt();
    }
  }
class Marks extends Student {
  int marksOne, marksTwo, marksThree;
  void getMarks() 
  {
    Scanner marks = new Scanner(System.in);
    System.out.print("Enter the marks of the first subject: ");
    marksOne = marks.nextInt();
    System.out.print("Enter the marks of the second subject: ");
    marksTwo = marks.nextInt();
    System.out.print("Enter the marks of the third subject: ");
    marksThree = marks.nextInt();
  }
}
class Result extends Marks {
  int total;
  float percentage;
  void Calculate() 
  {
    total = marksOne + marksTwo + marksThree;
    percentage = total / 3;
  }
  void Display()
  {
    System.out.println("\nName: " + name);
    System.out.println("Rollno: " + rollno);
    System.out.println("Marks in first subject: " + marksOne);
    System.out.println("Marks in second subject: " + marksTwo);
    System.out.println("Marks in third subject: " + marksThree);
    System.out.println("Total marks: " + total);
    System.out.println("Percentage: " + percentage);
  }
}
public class StudentMarks {
  public static void main(String[] args) {
    Result obj = new Result();
    obj.getDetails();
    obj.getMarks();
    obj.Calculate();
    obj.Display();
  }
}