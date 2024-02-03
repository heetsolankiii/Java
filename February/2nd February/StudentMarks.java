import java.util.*;
public class StudentMarks {
    int marks1;
    int marks2;
    int marks3;
    int rollNo;
    // Accepting marks from students
    void acceptMarks() {
        Scanner student = new Scanner(System.in);
        Scanner marksOne = new Scanner(System.in);
        Scanner marksTwo = new Scanner(System.in);
        Scanner marksThree = new Scanner(System.in);
        System.out.print("Enter your Roll No: ");
        rollNo = student.nextInt();
        System.out.print("Enter marks for 1st Subject: ");
        marks1 = marksOne.nextInt();
        System.out.print("Enter marks for 2nd Subject: ");
        marks2 = marksTwo.nextInt();
        System.out.print("Enter marks for 3rd Subject: ");
        marks3 = marksThree.nextInt();
    }
    // Displaying the marks
    void displayMarks(int percent) {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks in 1st Subject: " + marks1);
        System.out.println("Marks in 2nd Subject: " + marks2);
        System.out.println("Marks in 3rd Subject: " + marks3);
        System.out.println("Percentage is: " + percent);
    }
    // Calculatnig percentage
    int Percentage() {
        int percent = (((marks1 + marks2 + marks3)*100) / 300);
        return percent;
    }
    public static void main(String[] args) {
        StudentMarks studentOne = new StudentMarks();
        StudentMarks studentTwo = new StudentMarks();
        StudentMarks studentThree = new StudentMarks();
        studentOne.acceptMarks();
        studentTwo.acceptMarks();
        studentThree.acceptMarks();
        int percent = studentThree.Percentage(); // Calling percentage for the required student
        studentThree.displayMarks(percent); // Calling display for the required student

        // Also if you want to see marks for another student make sure to change the calling in percentage and display methods.
    }
}