import java.util.Scanner;

/**
This program calculates the average quiz score for a Student
This is the Test Class for the program.

@author Timothy McWatters
@version 1.0

COP2253    WorkShop 8
File Name: StudentTester.java
File 2 of 2
*/

public class StudentTester {
   public static void main(String[] args) {
      // creates a new instance of the Scanner class
      Scanner keyboard = new Scanner(System.in);
      
      // variables
      String name = "";
      String runAgain = "";
      int quizScore = 0;
      
      System.out.println("What is your name? ");
      name = keyboard.nextLine();
      Student student1 = new Student(name);  
      // do-while loop is to run the program once and then determine if you want to run the program again.
      do {  
            System.out.println("Please enter a quiz score: ");
            quizScore = keyboard.nextInt();  
            student1.addQuiz(quizScore);
            
            System.out.println("Would you like to enter more quiz scores? (Y/N)");
            runAgain = keyboard.next();
      } while (runAgain.equalsIgnoreCase("Y"));
      
      System.out.printf("%s\'s total score is %.2f, and average quiz score is %.2f.\n", name, student1.getTotalQuizScore(), student1.getAverageScore());
      
      Student student2 = new Student();
      System.out.println("What is the new students name? ");
      keyboard.nextLine();
      name = keyboard.nextLine();
      student2.setName(name);
      System.out.println("The new students name is " + student2.getName());
   }
}