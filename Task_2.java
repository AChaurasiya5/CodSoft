import java.util.*;
public class Task_2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of all subjects");
    int numSubject = sc.nextInt();

    if(numSubject == 0){
        System.out.println("please enter a valid number o subject");
        return;
    }

    int totalMarks = 0;
    int maxMarksPerSub = 100;
    
    for(int i = 1; i<=numSubject; i++){
        System.out.println("enter marks obtained in subject" + " " + "(out of 100)");
        int marks = sc.nextInt();

        if(marks < 0 || marks > maxMarksPerSub){
            System.out.println("Marks should be in the range of 0 to 100. Enter valid marks");
            i--;
        }
        else{
            totalMarks = totalMarks + marks;
        }
    }

    double averagePercentage = (double) totalMarks /(numSubject * maxMarksPerSub) * 100;
    System.out.println("Total Marks : " + totalMarks);
    System.out.println("Average Percentage : " + averagePercentage);

    String grade;
    if(averagePercentage >=90){
        grade = "A+";
    }
   else if(averagePercentage >=80){
        grade = "A";
    }
    if(averagePercentage >=70){
        grade = "B";
    }
    if(averagePercentage >=60){
        grade = "C";
    }
    if(averagePercentage >=50){
        grade = "D";
    }
    else{
        grade = "F";
    }
    System.out.println("Grade : " + grade);

   } 
}
