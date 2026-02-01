import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);//scanner object created to take user input

        // variable declarations
    int FinalExamgrade=0;
    int Midtermgrade=0;
    int Assignmentgrade=0;
    int testgrade=0;
    int AssignmentTotal=0;
    int TestAverage=0;
    int AAverage=0;
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
    double E = ((0.4 * FinalExamgrade) + (0.2 * Midtermgrade) + (0.1 * TestAverage))/70.0; // declaration and calculate E
    double W = ((E-60)/20)*0.3;     // declaration and calculate W

    double FinalGrade =0;
    //calculate final grade based on conditions
    if(E<60){
        FinalGrade=E;
    }
    else if(E>=60 && E< 80){
        FinalGrade=(1-W)*E +(W*AAverage);
    }
    else if(E>=80){
        FinalGrade=(0.4*FinalExamgrade)+(0.2*Midtermgrade)+(0.1*TestAverage)+(0.3*AAverage);
        
    }
    // multiply final grade by 100 to convert to percentage out of 100
    FinalGrade=FinalGrade*100;
    // output final grade in two decimal places format
    System.out.printf("Your final grade is: %.2f", FinalGrade);
}
}
