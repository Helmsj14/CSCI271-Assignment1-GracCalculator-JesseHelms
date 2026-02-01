import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    int Finalgrade=0;
    int Midtermgrade=0;
    int Assignmentgrade=0;
    int testgrade=0;
    int AssignmentTotal=0;
    for(int i=0;i<7;i++){
        System.out.printf("Please enter your 7 assignment grades: ");
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
        int AssignmentAverage = AssignmentTotal / 7;
    }
    input.close();
        System.out.println("Your total assignment grade is: " + AssignmentTotal);
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
    }
    input.close();
        System.out.println("Please enter your Midterm grade between 0-100: ");
        Midtermgrade = input.nextInt();
        if(Midtermgrade < 0 || Midtermgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
        }
            else if(Midtermgrade!= (int)Midtermgrade){
                System.out.println("Invalid grade entered, please enter a whole number between 0 and 100.");
            }
    input.close();
        System.out.println("Please enter your Final grade between 0-100: ");
        Finalgrade = input.nextInt();
        if(Finalgrade < 0 || Finalgrade > 100){
            System.out.println("Invalid grade entered, please enter a grade between 0 and 100.");
        }

}
}
