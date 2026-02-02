/*************************************************************************
* Assignment 1 for CSCI 271-001 Spring 2026
*
* Author: Jesse Helms
* OS: Windows 11
* Compiler: javac 25.0.1
* Date: February 1st, 2026
*
* Purpose
* This program asks for the grades of a student including 7 assignment grades, seven test grades,
* midterm grade, and final exam grade. Then it calculates the final grade based on the weights of each component
* 
*
*************************************************************************/
/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Jesse Helms
* W30671685
********************************************************************/


import java.util.Scanner;
public class CSCI271_Assignment1_JesseHelms_W30671685 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);//scanner object created to take user input

        // variable declarations
    int FinalExamgrade=0;           // variable to hold final exam grade
    int Midtermgrade=0;             // variable to hold midterm grade
    int Assignmentgrade=0;          // variable to hold assignment grade
    int testgrade=0;                // variable to hold test grade
    int AssignmentTotal=0;          // variable to hold total assignment grades
    int TestAverage=0;              // variable to hold average of test grades
    int AAverage=0;                 // variable to hold average of assignment grades
    //loop to take 7 assignment grades from user
    for(int i=0;i<7;i++){
        System.out.printf("Please enter your 7 assignment grades between 0 and 100: ");
        Assignmentgrade = input.nextInt();;
        AssignmentTotal = AssignmentTotal + Assignmentgrade;
        if(Assignmentgrade < 0 || Assignmentgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
            i--; // decrement i to repeat the iteration for valid input if grade is not between 0-100
        }
        else if(Assignmentgrade!= (int)Assignmentgrade){
            System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            i--; // decrement i to repeat the iteration for valid input if grade is not a whole number
        }
    }
    AAverage = AssignmentTotal / 7; //calculate average of assignment grades
    System.out.println("Your total assignment Average is: " + AAverage);
//output assignment average

    int TotalTest=0;// variable to hold total test grades and loop to take 7 test grades from user
    for(int i=0;i<7;i++){
        System.out.printf("Please enter your 7 Test grades between 0-100: ");
        testgrade = input.nextInt();
        TotalTest = TotalTest + testgrade;
        if(testgrade < 0 || testgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
            i--;
        }   // decrement i to repeat the iteration for valid input if grade is not between 0-100
        else if(testgrade!= (int)testgrade){
            System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            i--;
        }// decrement i to repeat the iteration for valid input if grade is not a whole number
        TestAverage = TotalTest / 7;
    }
    //calculate average of test grades
    System.out.println("Your total Test Average is: " + TestAverage);

// midterm and final exam grade input and validation
    System.out.println("Please enter your Midterm grade between 0-100: ");
    Midtermgrade = input.nextInt();
    if(Midtermgrade < 0 || Midtermgrade > 100){
         System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");

        }// validate midterm grade input is between 0-100

            else if(Midtermgrade!= (int)Midtermgrade){
                System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            }
        System.out.println("Please enter your Final grade between 0-100: ");

        FinalExamgrade = input.nextInt();

        if(FinalExamgrade < 0 || FinalExamgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
            } // validate final exam grade input is between 0-100
        else if(FinalExamgrade!= (int)FinalExamgrade){
             System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            }// validate final exam grade input is a whole number

    input.close();
    double E = (((0.4 * FinalExamgrade) + (0.2 * Midtermgrade) + (0.1 * TestAverage))/70.0)*100; // declaration and calculate E
    double W = ((E-60)/20)*0.3;     // declaration and calculate W

    System.out.println("E value is: " + E);
    double FinalGrade =0;
    //calculate final grade based on conditions
    if(E<60){ // E less than 60
        FinalGrade=E;
    }
    else if(E>=60 && E< 80){  // E between 60 and 80
        FinalGrade=(1-W)*E +(W*AAverage);
    }
    else if(E>=80){      // E greater than or equal to 80
        FinalGrade=(0.4*FinalExamgrade)+(0.2*Midtermgrade)+(0.1*TestAverage)+(0.3*AAverage);
        
    }
    // multiply final grade by 100 to convert to percentage out of 100
    
    // output final grade in two decimal places format
    System.out.printf("Your final grade is: %.2f", FinalGrade);
}
}

