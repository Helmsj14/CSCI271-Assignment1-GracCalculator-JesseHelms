import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    int FinalExamgrade=0;
    int Midtermgrade=0;
    int Assignmentgrade=0;
    int testgrade=0;
    int AssignmentTotal=0;
    int TestAverage=0;
    int AAverage=0;
    for(int i=0;i<7;i++){
        System.out.printf("Please enter your 7 assignment grades between 0 and 100: ");
        Assignmentgrade = input.nextInt();;
        AssignmentTotal = AssignmentTotal + Assignmentgrade;
        if(Assignmentgrade < 0 || Assignmentgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
            i--;
        }
        else if(Assignmentgrade!= (int)Assignmentgrade){
            System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            i--;
        }
        AAverage = AssignmentTotal / 7;
    }
        System.out.println("Your total assignment Average is: " + AAverage);

    int TotalTest=0;
    for(int i=0;i<7;i++){
        System.out.printf("Please enter your 7 Test grades between 0-100: ");
        testgrade = input.nextInt();
        TotalTest = TotalTest + testgrade;
        if(testgrade < 0 || testgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
            i--;
        }
        else if(testgrade!= (int)testgrade){
            System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            i--;
        }
        TestAverage = TotalTest / 7;
    }
    System.out.println("Your total Test Average is: " + TestAverage);
        System.out.println("Please enter your Midterm grade between 0-100: ");
        Midtermgrade = input.nextInt();
        if(Midtermgrade < 0 || Midtermgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
        }
            else if(Midtermgrade!= (int)Midtermgrade){
                System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            }
        System.out.println("Please enter your Final grade between 0-100: ");
        FinalExamgrade = input.nextInt();
        if(FinalExamgrade < 0 || FinalExamgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
        }
            else if(FinalExamgrade!= (int)FinalExamgrade){
                System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            }
    input.close();
    double E = ((0.4 * FinalExamgrade) + (0.2 * Midtermgrade) + (0.1 * TestAverage))/70.0;
    double W = ((E-60)/20)*0.3;

    double FinalGrade =0;
    if(E<60){
        FinalGrade=E;
    }
    else if(E>=60 && E< 80){
        FinalGrade=(1-W)*E +(W*AAverage);
    }
    else if(E>=80){
        FinalGrade=(0.4*FinalExamgrade)+(0.2*Midtermgrade)+(0.1*TestAverage)+(0.3*AAverage);
        
    }
    System.out.printf("Your final grade is: %.2f", FinalGrade);
}
}
