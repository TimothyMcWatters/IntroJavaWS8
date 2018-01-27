/**
This program calculates the average quiz score for a Student

@author Timothy McWatters
@version 1.0

COP2253    WorkShop 8
File Name: Student.java
File 1 of 2
*/

public class Student {
   //instance variables
   private String name = "";
   private double totalQuizScore = 0.0;
   private int numQuizesTaken = 0;
   
   /**
   Constructs the Student object with default values for instance fields
   */
   public Student() {
      name = "";
      totalQuizScore = 0.0;
      numQuizesTaken = 0;
   } //end of Student w/ 0 parameters (default)
   
   /**
   Constructs the Student object with a given name and the rest default values
   @param name: student name
   */   
   public Student(String name) {
      this.name = name;
      this.totalQuizScore = 0.0;
      this.numQuizesTaken = 0;
   } //end of Student w/ 1 parameter
   
   
   /**
   Sets the instance variable name
   @param name: the name of the student
   */   
   public void setName(String name) {
      this.name = name;
   } // end of setName method
   
   /**
   Returns the name of the student
   @return name: the name of the student
   */   
   public String getName() {
      return name;
   } // end of getName method

   
   /**
   Calculates and returns the average quiz score
   @returns a double representation of average quiz score
   */   
   public double getAverageScore() {
      return totalQuizScore / (double)numQuizesTaken;
   } // end of getAverageScore method
   
   /**
   Adds another quiz score to the student, both adding the score to the total and incrementing the number of quizes taken. 
   @param score: a new quiz score to add to the totalQuizScore.
   */   
   public void addQuiz(int score) {
      if ((score >= 0) && (score <= 100)) {
         totalQuizScore += score;
         numQuizesTaken++;
      } else {
         System.out.println("ERROR: The score you entered is not valid and will not be counted.");
      }
   } // end of addQuiz method
   
   /**
   Returns the total quiz score 
   @return totalQuizScore: returns a double representation of the total quiz score
   */   
   public double getTotalQuizScore() {
      return totalQuizScore;
   } // end of getTotalQuizScore method
   
} // end of Student class