
import java.util.Scanner;

public class xyz {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of subjects");
        int no_of_subjects = sc.nextInt();
        double total_marks = no_of_subjects*100;
        double obtained_marks = 0;

        for ( int i = 1; i<= no_of_subjects; i++){
            System.out.println("enter marks of subject"+" "+ i );
            double subject_marks = sc.nextDouble();

            obtained_marks = obtained_marks + subject_marks;
        }
        double Obtained_Percentage = (obtained_marks/total_marks) * 100;

        if(Obtained_Percentage >= 90 & Obtained_Percentage<=100){
            System.out.println("Obtained grade is A+");
        }
        else if (Obtained_Percentage>=80 & Obtained_Percentage<90) {
            System.out.println("Obtained grade is A");
        }
        else if (Obtained_Percentage>=70 & Obtained_Percentage<80) {
            System.out.println("Obtained grade is B+");
        }
        else if (Obtained_Percentage>=60 & Obtained_Percentage<70) {
            System.out.println("Obtained grade is B");
        }
        else if (Obtained_Percentage>=50 & Obtained_Percentage<60) {
            System.out.println("Obtained grade is C+");
        }
        else if (Obtained_Percentage>=40 & Obtained_Percentage<50) {
            System.out.println("Obtained grade is C");
        }
        else {
            System.out.println("Obtained grade is Trash");
        }
}
    
} 