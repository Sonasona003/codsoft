import java.util.Scanner;


public class Grade{

	public static void main(String[] args) {
	
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.println("Enter your total number of subjects: ");
		        int totalSubjects = scanner.nextInt();

		        
		        int[] marks = new int[totalSubjects];

		    
		        for (int i = 0; i < totalSubjects; i++) {
		            System.out.println("Enter the marks got out of 100 in every subject " + (i + 1) + ": ");
		            marks[i] = scanner.nextInt();
		        }

		        
		        int Grandtotal = 0;
		        for (int mark : marks) {
		            
					Grandtotal += mark;
		        }

		        
		        float average= (float) Grandtotal / totalSubjects;

		        
		        String grade;
		        if (average>= 90) {
		            grade = "A";
		        } else if (average >= 80) {
		            grade = "B";
		        } else if (average >= 70) {
		            grade = "C";
		        } else if (average >= 60) {
		            grade = "D";
		        } else {
		            grade = "F";
		        }

		        
		        System.out.println("Grandtotal: " + Grandtotal+"/"+(totalSubjects*100));
		        System.out.println("Average percentage: " + average);
		        System.out.println("Grade: " + grade);

		        
		        scanner.close();
		    }
		}