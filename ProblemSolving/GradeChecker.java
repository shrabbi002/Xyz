package ProblemSolving;

import java.util.Scanner;

public class GradeChecker {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a score (0-100): ");
	        int score = scanner.nextInt();

	        if (score >= 90) {
	            System.out.println("A");
	        } else if (score >= 80) {
	            System.out.println("B");
	        } else if (score >= 70) {
	            System.out.println("C");
	        } else if (score >= 60) {
	            System.out.println("D");
	        } else {
	            System.out.println("F");
	        }

	}

}
