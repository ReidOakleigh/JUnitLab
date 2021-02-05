package week1;

import java.util.Scanner;

/**************************************************************
 * Name        : GradeBook program
 * Author      : Rumbi Chinhamhora
 * Created     : 1/22/2021
 * Course      : CIS 152 Data Structures
 * Language    : Java
 * Version     : 1.0
 * OS          : Windows 10
 * Copyright   : This is my own original work based on
 *               specifications issued by our instructor
 * Description : This program overall description here
 *               Input:  list and describe
 *               Output: list and describe
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or
 * unmodified. I have not given other fellow student(s) access to
 * my program.
 ***************************************************************/
public class GradeBookDriver {
// Declare a Scanner object
    Scanner in;

    /**
     * Main method entry point
     * @param args : String[]
     * @return void
     */
    public static void main( String[] args ) {
        new GradeBookDriver().go();
    }

    /**
     * Mainline logic
     * @return void
     */
    private void go() {
        Gradebook gradebook = new Gradebook();
        in = new Scanner(System.in);
        int noScores = promptInt("How many scores would you like to enter? ");
        for ( int i = 0; i < noScores; i++ ) {
            int score = promptInt("Enter a score: ");
            gradebook.addGrade(score);
        }
        System.out.println("\nScore -------- Grade");
        for (Grade grade : gradebook.getGrades()) {
            System.out.printf("%4d  --------   %s\n", grade.getGrade(), grade.getLetter());
        }
    }

    /**
     * Prompts for an integer
     * @param prompt : String
     * @return : int
     */
    private int promptInt(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
}
